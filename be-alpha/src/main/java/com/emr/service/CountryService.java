package com.emr.service;
import java.util.List;
import com.emr.model.Country;



public interface CountryService {
	Country createCountry(Country counRequest);

   List<Country> getCountry();
	
	Country getCountryById(int id);
	
	Country updateCountry(int id, Country counRequest );

	 void deleteCountryById(int Id);
}
