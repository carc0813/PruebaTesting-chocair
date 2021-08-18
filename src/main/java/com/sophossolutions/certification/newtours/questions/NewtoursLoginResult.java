package com.sophossolutions.certification.newtours.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


import com.sophossolutions.certification.newtours.userinterfaces.NewtoursFlightFinderPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para vereficar el ingreso correcto del login
 * @author manco.5@hotmail.com
 */

public class NewtoursLoginResult implements Question<Boolean> {

	private static String errorMessage = "wrong credentials";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si el elemento PASSANGERS_COUNT esta actualmente visible para el actor
		 return the(NewtoursFlightFinderPage.PASSANGERS_COUNT).answeredBy(actor).isCurrentlyVisible();
	}

	//Constructor de la clase	
	public static NewtoursLoginResult page() {
		return new NewtoursLoginResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}
	
}