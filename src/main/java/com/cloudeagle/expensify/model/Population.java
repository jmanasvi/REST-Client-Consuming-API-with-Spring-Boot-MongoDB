package com.cloudeagle.expensify.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="Population")
@JsonIgnoreProperties(ignoreUnknown=true)	
public class Population {
	
	
	@JsonProperty("ID Nation")
	private String idNation;
	
	@JsonProperty("Nation")
	private String nation;
	
	@Id
	@JsonProperty("ID Year")
	private int idYear;
	
	@JsonProperty("Year")
    private int year;
	
	@JsonProperty("Population")
    private int population;
	
	@JsonProperty("Slug Nation")
    private String slugNation;
    
    
	public String getIdNation() {
		return idNation;
	}
	public void setIdNation(String idNation) {
		this.idNation = idNation;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getIdYear() {
		return idYear;
	}
	public void setIdYear(int idYear) {
		this.idYear = idYear;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getSlugNation() {
		return slugNation;
	}
	public void setSlugNation(String slugNation) {
		this.slugNation = slugNation;
	}
   

}
