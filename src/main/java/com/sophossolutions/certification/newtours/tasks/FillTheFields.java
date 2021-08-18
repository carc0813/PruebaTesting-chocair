package com.sophossolutions.certification.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.certification.newtours.models.RegisterModel;
import com.sophossolutions.certification.newtours.userinterfaces.NewtoursRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

/**
 * Clase Task (tarea) para realizar el ingreso de los datos al registro, traidos
 * desde el feature como un model (RegisterModel)
 * 
 * @author manco.5@hotmail.com
 */

public class FillTheFields implements Task {

	// modelo de registro
	private RegisterModel registerModel;

	// constructor de la tarea
	public FillTheFields(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}

	//Ingresa los atributos del modelo en los campos del registro
	@Override
	@Step("{0} fill the username on loggin NewTours Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(registerModel.getFirstName()).into(NewtoursRegisterPage.FIRSTNAME),
				Enter.theValue(registerModel.getLastName()).into(NewtoursRegisterPage.LASTNAME),
				Enter.theValue(registerModel.getPhone()).into(NewtoursRegisterPage.PHONE),
				Enter.theValue(registerModel.getEmail()).into(NewtoursRegisterPage.EMAIL),
				Enter.theValue(registerModel.getAddress()).into(NewtoursRegisterPage.ADDRESS),
				Enter.theValue(registerModel.getCity()).into(NewtoursRegisterPage.CITY),
				Enter.theValue(registerModel.getState()).into(NewtoursRegisterPage.STATE),
				Enter.theValue(registerModel.getPostalCode()).into(NewtoursRegisterPage.POSTALCODE),
				//Selector para el menu desplegable COUNTRY
				SelectFromOptions.byVisibleText(registerModel.getCountry().toUpperCase())
						.from(NewtoursRegisterPage.COUNTRY),
				Enter.theValue(registerModel.getUserName()).into(NewtoursRegisterPage.USERNAME),
				Enter.theValue(registerModel.getPassword()).into(NewtoursRegisterPage.PASSWORD),
				Enter.theValue(registerModel.getConfirmPassword()).into(NewtoursRegisterPage.CONFIRM_PASSWORD),
				Click.on(NewtoursRegisterPage.SUBMIT_BUTTON));
	}

	// metodo que llama al instrumented que crea una instancia en tiempo de
	// ejecución, con el parametro de tipo RegisterModel
	public static FillTheFields withThe(RegisterModel registerModel) {
		return instrumented(FillTheFields.class, registerModel);
	}

}