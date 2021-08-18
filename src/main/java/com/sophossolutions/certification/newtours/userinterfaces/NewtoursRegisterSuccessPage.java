package com.sophossolutions.certification.newtours.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Clase PageObject que contiene el mapeo de la pagina de exito del registro de newtours
 *  
 * @author manco.5@hotmail.com
 */
public class NewtoursRegisterSuccessPage extends PageObject {
	public static final Target SIGN_OFF_BUTTON = Target.the("The sign off button").locatedBy("//a[.='SIGN-OFF']");
}
