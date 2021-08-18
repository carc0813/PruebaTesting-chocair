package com.sophossolutions.certification.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Clase PageObject que contiene el mapeo de la pagina de Flight Finder de newtours
 * 
 * @author manco.5@hotmail.com
 */
public class NewtoursFlightFinderPage extends PageObject{
	
	public static final Target PASSANGERS_COUNT = Target.the("passangers count").located(By.name("passCount"));
	public static final Target PASSANGERS_TEXT = Target.the("passangers text").locatedBy("//b[.='Passengers:']");
	public static final Target FLIGHT_FINDER_TITLE = Target.the("flight finder title").locatedBy("//title[.='Find a Flight: Mercury Tours: ']");

}
