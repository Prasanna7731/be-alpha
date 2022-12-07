package com.emr.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emr.model.Country;


import com.emr.service.CountryService;



@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	
	@RequestMapping( "/countryhello" )
	   public String echo() {
	      return "Hello Prasanna Kumar Tata !!!";
	   }
	@PostMapping("/country/add")
	public ResponseEntity<String> createCountry(@RequestBody Country counRequest) {
		
		Country cnt = countryService.createCountry(counRequest);

		return ResponseEntity.status(201).body("Country Created Successfully with Id "+cnt.getC_id());
	}
	
	
	@GetMapping("/country/list")
	public List<Country> getCountry() {
		
		return countryService.getCountry();
	}
	
	
	// build get employee by id REST API
    @GetMapping("/country/list/{id}")
    public Country getCountryById(@PathVariable  int id)
    {
    	return countryService.getCountryById(id);
		  	
    }
    
    @PutMapping("/country/edit/{id}")
    public ResponseEntity<String> updateCountry(@PathVariable int id,@RequestBody Country counRequest) {
    	Country count =  countryService.updateCountry(id,counRequest);
               
               return ResponseEntity.status(201).body("Country Updated Successfully with Id "+count.getC_id());
		
       }
    
    

    @DeleteMapping("/country/delete/{id}")
    public ResponseEntity<String> deleteCountryById(@PathVariable int id)                               
    {
    	countryService.deleteCountryById(id);
        return ResponseEntity.status(200).body("Country Deleted Successfully");
    }
}
