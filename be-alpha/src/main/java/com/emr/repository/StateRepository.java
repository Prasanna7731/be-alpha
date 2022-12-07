package com.emr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emr.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	

}
