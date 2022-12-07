
package com.emr.service;
import java.util.List;


import com.emr.model.State;




public interface StateService {
	
	State createState(State staRequest);

	 List<State> getState();
	
	State getStateById(int id);
	
	State updateState(int id, State staRequest );

	 void deleteStateById(int Id);



	 
}
