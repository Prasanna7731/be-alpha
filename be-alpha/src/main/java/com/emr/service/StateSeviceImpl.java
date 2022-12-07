package com.emr.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.emr.model.Country;
import com.emr.model.State;
import com.emr.repository.StateRepository;


@Service
public class StateSeviceImpl  implements StateService {
	
	@Autowired
	StateRepository stateRepository;


	@Override
	public State createState(State staRequest) {
		// TODO Auto-generated method stub
		return stateRepository.save(staRequest);
	}

	@Override
	public List<State> getState() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

	
	  @Override
	  public State getStateById(int id) { // TODO Auto-generated method
	   return stateRepository.findById(id).get();
	  
	  }
	 

	@Override
	public State updateState(int id, State staRequest) {
		// TODO Auto-generated method stub
		 	State sta = stateRepository.getById(id);
		sta.setStatename(staRequest.getStatename());
		sta.setStatecode(staRequest.getStatecode());
	
		return stateRepository.save(staRequest);
	  }
	
	
	@Override
	public void deleteStateById(int Id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(Id);
		
	}

	
	
}
