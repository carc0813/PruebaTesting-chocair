package com.sophossolutions.certification.newtours.models;

/**
 * Clase modelo para la persona que se quiere loggear en newtours (el actor)
 * @author manco.5@hotmail.com
 */

public class PersonaModel {
	
	private String userName;
	private String password;
	
	public PersonaModel(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
