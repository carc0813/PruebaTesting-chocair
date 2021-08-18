package com.sophossolutions.certification.newtours.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.sophossolutions.certification.newtours.exceptions.UnableToLogin.getUnableToLoginMessage;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.certification.newtours.exceptions.UnableToLogin;
import com.sophossolutions.certification.newtours.models.PersonaModel;
import com.sophossolutions.certification.newtours.questions.NewtoursLoginResult;
import com.sophossolutions.certification.newtours.tasks.EnterThe;
import com.sophossolutions.certification.newtours.tasks.OpenTheBrowser;
import com.sophossolutions.certification.newtours.userinterfaces.NewtoursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

/**
 * Step Definitions del feature que realiza el login de newtours
 *  
 * @author manco.5@hotmail.com
 */
public class NewtorsLoginStepDefinitions {
	
	//Definición del driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;

	private Actor stiven = Actor.named("stiven");

	private NewtoursHomePage newtoursHomePage;

	//Inicialización del driver a cargo del actor
	@Before
	public void setUp() {
		stiven.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Stiven wants into newtours page$")
	public void thatStivenWantsIntoNewtoursPage() {
		stiven.wasAbleTo(OpenTheBrowser.on(newtoursHomePage));
	}

	@When("^he enter the credentials$")
	public void heEnterTheCredentialsAnd(List<PersonaModel> credentials) {
		stiven.attemptsTo(EnterThe.credentials(credentials.get(0)));
	}

	@Then("^he should see the flight finder screen$")
	public void heShouldSeeTheFlightFinderScreen() {
		stiven.should(seeThat(NewtoursLoginResult.page()).orComplainWith(UnableToLogin.class, 
				getUnableToLoginMessage()));
	}
}