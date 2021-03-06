package com.gpsfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String name;
	private String codeDdi;
	
	public Country() {
	}

	public Country(Long id, @NotNull @NotBlank String name, String codeDdi) {
		this.id = id;
		this.name = name;
		this.codeDdi = codeDdi;
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
	
	public String getCodeDdi() {
		return codeDdi;
	}

	public void setCodeDdi(String codeDdi) {
		this.codeDdi = codeDdi;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", codeDdi=" + codeDdi + "]";
	}
}
