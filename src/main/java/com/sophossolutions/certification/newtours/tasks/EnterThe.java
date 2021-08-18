package com.sophossolutions.certification.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.certification.newtours.exceptions.UnableToLogin;
import com.sophossolutions.certification.newtours.models.PersonaModel;
import com.sophossolutions.certification.newtours.userinterfaces.NewtoursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

/**
 * Clase Task (tarea) para realizar el ingreso de las credenciales necesarias en
 * el login
 * 
 * @author manco.5@hotmail.com
 */

public class EnterThe implements Task {

	// modelo de persona con credenciales (userName y password)
	private PersonaModel personaModel;

	// constructor de la tarea
	public EnterThe(PersonaModel personaModel) {
		this.personaModel = personaModel;
	}

	// Desarrollo de la tarea
	@Override
	@Step("{0} Enter the credentials")
	public <T extends Actor> void performAs(T actor) {
		// Ingresa el userName de la persona en el campo USERNAME_TEXTBOX
		actor.attemptsTo(Enter.theValue(personaModel.getUserName()).into(NewtoursHomePage.USERNAME_TEXTBOX),
				// Ingresa el password de la persona en el campo PASSWORD_TEXTBOX
				Enter.theValue(personaModel.getPassword()).into(NewtoursHomePage.PASSWORD_TEXTBOX),
				// El actor le da click al boton SIGN_IN_BUTTON
				Click.on(NewtoursHomePage.SIGN_IN_BUTTON));
	}

	// metodo que llama al instrumented que crea una instancia en tiempo de
	// ejecución, con el parametro de tipo PersonaModel
	public static EnterThe credentials(PersonaModel personaModel) {
		return instrumented(EnterThe.class, personaModel);
	}

	//Metodo que retorna el mensaje de error, cuando el registro no fue exitoso
	public String getUnableToLoginMessage() {
		return String.format(UnableToLogin.getUnableToLoginMessage());
	}
}
