
package com.emr.service;
import java.util.List;      

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.emr.model.Employee;
import com.emr.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee empRequest) {
		// TODO Auto-generated method stub
		return employeeRepository.save(empRequest);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}
	
	


	public Employee updateEmployee(Employee empRequst) {
		return employeeRepository.save(empRequst);
	}
	
	

	@Override
	public Employee updateEmployee(int id, Employee empRequest) {
		// TODO Auto-generated method stub
		Employee emp =employeeRepository.getById(id);
		emp.setName(empRequest.getName());
		emp.setMobile(empRequest.getMobile());
		return employeeRepository.save(emp);
	}
	
	

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		employeeRepository.deleteById(id);
		
	}
	
}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public Employee deleteEmployee(Employee empRequest) {
//		// TODO Auto-generated method stub
//		return employeeRepository.save(empRequest);
//	}
//
//	@Override
//	public Employee deleteEmployee(int id, Employee empRequest) {
//		// TODO Auto-generated method stub
//		
//		Employee emp =employeeRepository.getById(id);
//		emp.setName(empRequest.getName());
//		emp.setMobile(empRequest.getMobile());
//		return employeeRepository.save(emp);
//		
		
	






