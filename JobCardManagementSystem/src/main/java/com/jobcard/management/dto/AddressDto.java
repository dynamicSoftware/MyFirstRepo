package com.jobcard.management.dto;

import org.springframework.stereotype.Component;

@Component
public class AddressDto {

	private String state;
	private String city;
	private String street;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "AddressDto [state=" + state + ", city=" + city + ", street=" + street + "]";
	}
	
	
}
