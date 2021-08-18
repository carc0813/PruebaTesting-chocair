	package com.sophossolutions.certification.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
/**
 * Clase PageObject que contiene el mapeo de la pagina de registro de newtours
 * con la URL por defecto
 *  
 * @author manco.5@hotmail.com
 */
@DefaultUrl("http://newtours.demoaut.com/mercuryregister.php")
public class NewtoursRegisterPage extends PageObject {
	
	public static final Target REGISTER_BUTTON = Target.the("The Register Button").located(By.linkText("REGISTER"));
	public static final Target FIRSTNAME = Target.the("The firts name input").located(By.name("firstName"));
	public static final Target LASTNAME = Target.the("The last name input").located(By.name("lastName"));
	public static final Target PHONE = Target.the("The phone input").located(By.name("phone"));
	public static final Target EMAIL = Target.the("The Email input").located(By.id("userName"));
	public static final Target ADDRESS = Target.the("The address input").located(By.name("address1"));
	public static final Target CITY = Target.the("The city input").located(By.name("city"));
	public static final Target STATE = Target.the("The state input").located(By.name("state"));
	public static final Target POSTALCODE = Target.the("The postalcode input").located(By.name("postalCode"));
	public static final Target COUNTRY = Target.the("The combo box country").located(By.name("country"));
	public static final Target USERNAME = Target.the("The username input").located(By.id("email"));
	public static final Target PASSWORD = Target.the("The password input").located(By.name("password"));
	public static final Target CONFIRM_PASSWORD = Target.the("The confirm password input").located(By.name("confirmPassword"));
	public static final Target SUBMIT_BUTTON = Target.the("The sumbit button").located(By.name("register"));
	
}