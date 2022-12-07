package com.emr.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Entity
@Table(name="country")
public class Country {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="country_Id")
	private Integer country_Id;
	
	@Column(name="country_Name")
	private String country_Name;
	
	@Column(name="country_code")
	private String country_Code;
	
	@OneToMany(targetEntity = State.class,cascade = CascadeType.ALL)
	@JoinColumn(name="country_Id_fk", referencedColumnName = "country_Id")
	private List<State> states;

	public Integer getCountry_Id() {
		return country_Id;
	}

	public void setCountry_Id(Integer country_Id) {
		this.country_Id = country_Id;
	}

	public String getCountry_Name() {
		return country_Name;
	}

	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}

	public String getCountry_Code() {
		return country_Code;
	}

	public void setCountry_Code(String country_Code) {
		this.country_Code = country_Code;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	
}
