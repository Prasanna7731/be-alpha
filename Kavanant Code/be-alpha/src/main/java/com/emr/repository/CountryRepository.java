package com.emr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.dto.CountryRequest;
import com.emr.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	//Country updatecountry(Integer country_Id, CountryRequest request);


}
