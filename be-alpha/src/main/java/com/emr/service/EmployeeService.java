package com.emr.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.emr.model.Employee;

public interface EmployeeService {


	Employee createEmployee(Employee empRequest);

	List<Employee> getEmployees();
	
	Employee getEmployeeById(int id);
	
    Employee updateEmployee(int id, Employee empRequest );

	 void deleteEmployeeById(int Id);

   }










