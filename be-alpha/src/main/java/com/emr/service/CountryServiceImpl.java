package com.emr.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.model.Country;
import com.emr.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
		
	@Autowired
	CountryRepository countryRepository;
	
	

	@Override
	public Country createCountry(Country counRequest) {
		// TODO Auto-generated method stub
		
		return countryRepository.save(counRequest);
	}

	@Override
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	@Override
	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		return  countryRepository.findById(id).get();
	}
	
	
	@Override
	public Country updateCountry(int id, Country counRequest) {
		// TODO Auto-generated method stub
		Country cnt =countryRepository.getById(id);
		cnt.setCountryname(counRequest.getCountryname());
		return countryRepository.save(cnt);
	}

	@Override
	public void deleteCountryById(int id) {
		// TODO Auto-generated method stub
		countryRepository.deleteById(id);
	}

}

























/*
 * public Employee updateEmployee(Employee countRequst) { return
 * countryRepository.save(countRequst); }
 */
