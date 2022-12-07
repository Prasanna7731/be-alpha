package com.emr.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emr.model.Employee;
import com.emr.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping( "/hello" )
	   public String echo() {
	      return "Hello Prasanna!";
	   }
	
	@PostMapping("/employee/add")
	public ResponseEntity<String> createEmployee(@RequestBody Employee empRequest) {
		
		Employee employee = employeeService.createEmployee(empRequest);

		return ResponseEntity.status(201).body("Employee Created Successfully with Id "+employee.getId());
	}
	
	@GetMapping("/employee/list")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();
	}
	

    @GetMapping("/employee/list/{id}")
    public Employee getEmployeeById(@PathVariable  int id)
    {
    	return employeeService.getEmployeeById(id);
		  	
    }
	
	
	
	@PutMapping("/employee/edit/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id,@RequestBody Employee empRequest) {
		Employee employee =  employeeService.updateEmployee(id,empRequest);
               
               return ResponseEntity.status(201).body("Employee Updated Successfully with Id "+employee.getId());
		
       }
	

    @DeleteMapping("/employee/delete/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable  int id)                               
    {
    	employeeService.deleteEmployeeById(id);
        return ResponseEntity.status(200).body("Employee Deleted Successfully");
    }
}
	
	
	






















































	
	

