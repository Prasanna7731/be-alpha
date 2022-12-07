package com.emr.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;	
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

	@Entity
	@Table(name = "Countrystate")


	public class State {
		
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		
		@Column(name = "id")
		private int id;
		
		  @ManyToOne
		  
		 @JoinColumn(name="country_id" ) 
		 private Country country;
		
		@Column(name = "statename")
		private String statename;
		
		@Column(name = "statecode")
		private String statecode;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Country getCountry() {
			return country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public String getStatename() {
			return statename;
		}

		public void setStatename(String statename) {
			this.statename = statename;
		}

		public String getStatecode() {
			return statecode;
		}

		public void setStatecode(String statecode) {
			this.statecode = statecode;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



