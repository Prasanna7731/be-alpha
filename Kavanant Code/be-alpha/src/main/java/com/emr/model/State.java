package com.emr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name="state")
public class State {
	
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="state_Id")
	private Integer state_Id;
	
	@Column(name="state_Name")
	private String  state_Name;
	
	@Column(name="state_Code")
	private String state_Code;
	
	public Integer getState_Id() {
		return state_Id;
	}
	public void setState_Id(Integer state_Id) {
		this.state_Id = state_Id;
	}
	public String getState_Name() {
		return state_Name;
	}
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}
	public String getState_Code() {
		return state_Code;
	}
	public void setState_Code(String state_Code) {
		this.state_Code = state_Code;
	}
	
	}
	
	
	