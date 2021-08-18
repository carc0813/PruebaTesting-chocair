package com.sophossolutions.certification.newtours.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.certification.newtours.userinterfaces.NewtoursComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar la conexion de internet, comparando con un elemento del menu de newtours
 * @author manco.5@hotmail.com
 */

public class NewtoursPageVisible implements Question<Boolean>  {
	
	//verifica si el boton HOME_BUTTON esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(NewtoursComponent.HOME_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new NewtoursPageVisible();
	}

}