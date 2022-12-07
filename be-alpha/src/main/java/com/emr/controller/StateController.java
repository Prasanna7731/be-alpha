
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


import com.emr.model.State;
import com.emr.service.StateService;


@RestController
public class StateController {
	
	@Autowired
	StateService stateService;
	
	
	@RequestMapping( "/state/hello" )
	   public String echo() {
	      return "@ Hello Tata Prasanna Kumar @!!!";
	   }
	
	@PostMapping("/state/add")
	public ResponseEntity<String> createState(@RequestBody State staRequest) {
		
		State state = stateService.createState(staRequest);

		return ResponseEntity.status(201).body("State Created Successfully with Id "+state.getId());
	}
	
	@GetMapping("/state/list")
	public List<State> getState() {
		
		return stateService.getState();
	}
	
	// build get employee by id REST API
    @GetMapping("/state/list/{id}")
    public State getStateById(@PathVariable  int id)
    {
    	return stateService.getStateById(id);
		  	
    }
	
	
	
	@PutMapping("/state/edit/{id}")
    public ResponseEntity<String> updateState(@PathVariable int id,@RequestBody State staRequest) {
		State sta1 =  stateService.updateState(id,staRequest);
               
               return ResponseEntity.status(201).body("State Updated Successfully with Id "+sta1.getId());
		
       }
	

    @DeleteMapping("/state/delete/{id}")
    public ResponseEntity<String> deleteStateById(@PathVariable  int id)                               
    {
    	stateService.deleteStateById(id);
        return ResponseEntity.status(200).body("Statee Deleted Successfully");
    }
}
	
	
	






















































	
	


