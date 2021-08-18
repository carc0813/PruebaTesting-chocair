package com.sophossolutions.certification.newtours.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.certification.newtours.userinterfaces.NewtoursRegisterSuccessPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para vereficar el registro correcto del usuario
 * @author manco.5@hotmail.com
 */

public class NewtoursRegisterResult implements Question<Boolean> {

	private static String errorMessage = "wrong register";

	//verifica si el boton SIGN_OFF_BUTTON esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(NewtoursRegisterSuccessPage.SIGN_OFF_BUTTON).answeredBy(actor).isCurrentlyVisible();

	}

	public static NewtoursRegisterResult page() {
		return new NewtoursRegisterResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}
}
