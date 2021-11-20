package com.gpsfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String name;
	private String codeDdd;
	@ManyToOne
	private State state;
	@ManyToOne
	private Country country;
	
	public City() {}

	public City(Long id, @NotNull @NotBlank String name, String codeDdd, State state, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.codeDdd = codeDdd;
		this.state = state;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeDdd() {
		return codeDdd;
	}

	public void setCodeDdd(String codeDdd) {
		this.codeDdd = codeDdd;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", codeDdd=" + codeDdd + ", state=" + state + ", country="
				+ country + "]";
	}
}
