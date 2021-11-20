package com.gpsfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String uf;
	@NotNull
	@NotBlank
	private String description;
	@NotNull
	@ManyToOne
	private Country country;
	
	public State() {}

	public State(Long id, @NotNull @NotBlank String uf, @NotNull @NotBlank String description,
			@NotNull Country country) {
		this.id = id;
		this.uf = uf;
		this.description = description;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", uf=" + uf + ", description=" + description + ", country=" + country + "]";
	}
}
