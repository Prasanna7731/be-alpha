package com.emr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emr.dto.CountryRequest;
import com.emr.model.Country;
import com.emr.repository.CountryRepository;
import com.emr.repository.StateRepository;

@RestController
public class CountryController {
	@Autowired
	StateRepository stateRepository;

	@Autowired
	CountryRepository countryRepository;

	@PostMapping("/createcountry")
	public Country createcountry(@RequestBody CountryRequest request) {
		return countryRepository.save(request.getCountry());
	}

	@GetMapping("/findallcountries")
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}

	@GetMapping("/findallcountries/{country_Id}")
	public Optional<Country> findbyCountry(@PathVariable Integer country_Id) {
		return countryRepository.findById(country_Id);
	}

	@PutMapping("/updatecountry/{country_Id}")
	public ResponseEntity<String> updatecountry(@PathVariable Integer country_Id, @RequestBody CountryRequest request) {
		//Country country = countryRepository.updatecountry(country_Id, request);
		countryRepository.deleteById(country_Id);
		
		Country country = countryRepository.save(request.getCountry());
		
		return ResponseEntity.status(201)
				.body("Country Details updated Successfully with Country_Id " + country.getCountry_Id());
	}

	@DeleteMapping("/deletecountry/{country_Id}")
	public ResponseEntity<String> deletecountry(@PathVariable Integer country_Id) {
		countryRepository.deleteById(country_Id);
		return ResponseEntity.status(200).body("Country Record Deleted Successfully with Country_Id" + country_Id);
	}

}
