package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;
@Entity
@Table(name="silme")
public class City {
	@Id
	
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)//id otoamatik artması
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="countrycode")
	private String countryCode;
	
	@Column(name="population")
	private int population;
	
	@Column(name="district")
	private String district;
	
	
	
	public City(int id, String name, String countryCode, int population, String district) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.population = population;
		this.district = district;
	}
	
	public City() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

}
