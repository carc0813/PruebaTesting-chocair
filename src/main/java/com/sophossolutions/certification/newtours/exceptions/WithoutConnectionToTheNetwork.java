package com.sophossolutions.certification.newtours.exceptions;

/**
 * Excepci�n para controlar la conexi�n a internet
 * @author manco.5@hotmail.com
 */
public class WithoutConnectionToTheNetwork extends AssertionError {

	private static final long serialVersionUID = 1L;
	private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";

	public static String getErrorNetworkMessage() {
		return ERROR_NETWORK_CONNECTION;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public WithoutConnectionToTheNetwork(String message, Throwable cause) {
		super(message, cause);
	}

}
