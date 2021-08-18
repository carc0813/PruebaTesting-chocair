package com.sophossolutions.certification.newtours.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
/**
 * Clase PageObject que contiene el mapeo de la pagina de inicio de newtours
 * con la URL por defecto
 *  
 * @author manco.5@hotmail.com
 */
@DefaultUrl("http://newtours.demoaut.com/")
public class NewtoursHomePage extends PageObject{
	
	public static final Target USERNAME_TEXTBOX = Target.the("username textbox").located(By.name("userName"));
	public static final Target PASSWORD_TEXTBOX = Target.the("password textbox").located(By.name("password"));
	public static final Target SIGN_IN_BUTTON = Target.the("sign in button").located(By.name("login"));

}
