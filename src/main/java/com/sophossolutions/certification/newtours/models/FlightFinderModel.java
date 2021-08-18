package com.sophossolutions.certification.newtours.models;

/**
 * Clase modelo para el formulario Flight Finder en newtours 
 * @author manco.5@hotmail.com
 */
public class FlightFinderModel {
	
	//Campos del formulario
	
	private String type;
	private String passengers;
	private String departingFrom;
	private String onMonth;
	private String onDay;
	private String arrivingIn;
	private String returningMonth;
	private String returningDay;
	private String serviceClass;
	private String airline;
	
	//Getter y Setter de los campos del formulario
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	public String getOnMonth() {
		return onMonth;
	}
	public void setOnMonth(String onMonth) {
		this.onMonth = onMonth;
	}
	public String getOnDay() {
		return onDay;
	}
	public void setOnDay(String onDay) {
		this.onDay = onDay;
	}
	public String getArrivingIn() {
		return arrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}
	public String getReturningMonth() {
		return returningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public String getReturningDay() {
		return returningDay;
	}
	public void setReturningDay(String returningDay) {
		this.returningDay = returningDay;
	}
	public String getServiceClass() {
		return serviceClass;
	}
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
}
