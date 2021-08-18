package com.sophossolutions.certification.newtours.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Clase PageObject que contiene el mapeo de los componentes del menú lateral de newtours
 * 
 * @author manco.5@hotmail.com
 */

public class NewtoursComponent extends PageObject {

	public static final Target HOME_BUTTON = Target.the("Home button").locatedBy("//a[.='Home']");

}
