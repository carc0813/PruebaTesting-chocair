package com.sophossolutions.certification.newtours.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.certification.newtours.models.RegisterModel;
import com.sophossolutions.certification.newtours.questions.NewtoursRegisterResult;
import com.sophossolutions.certification.newtours.tasks.FillTheFields;
import com.sophossolutions.certification.newtours.tasks.OpenTheBrowser;
import com.sophossolutions.certification.newtours.userinterfaces.NewtoursRegisterPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
/**
 * Step Definitions del feature que realiza el registro de newtours
 *  
 * @author manco.5@hotmail.com
 */
public class NewtoursRegisterStepDefinitions {

	//Definición del driver
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;

	private Actor stiven = Actor.named("stiven");

	private NewtoursRegisterPage newtoursRegisterPage;
	
	//Inicialización del driver a cargo del actor
	@Before
	public void setUp() {
		stiven.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Stiven is in the register newtours page$")
	public void thatStivenIsInTheRegisterNewtoursPage() {
		stiven.wasAbleTo(OpenTheBrowser.on(newtoursRegisterPage));
	}

	@When("^he enter the data$")
	public void heEnterTheData(List<RegisterModel> data) {
		stiven.attemptsTo(FillTheFields.withThe(data.get(0)));
	}

	@Then("^he should see the account newtours sucess screen$")
	public void heShouldSeeTheAccountNewtoursSucessScreen() {
		stiven.should(seeThat(NewtoursRegisterResult.page()));
	}

}
