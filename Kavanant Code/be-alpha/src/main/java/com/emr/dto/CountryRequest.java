package com.emr.dto;

import com.emr.model.Country;

import lombok.ToString;

@ToString
public class CountryRequest {
	
	private Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Object getbyId() {
		// TODO Auto-generated method stub
		return country.getCountry_Id() ;
		
	}
	
	
}
