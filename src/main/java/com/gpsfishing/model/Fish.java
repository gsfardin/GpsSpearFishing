package com.gpsfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Fish {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String name;
	private String scientificName;
	@NotNull
	private Integer initialScore;
	
	public Fish() {}

	public Fish(Long id, @NotNull @NotBlank String name, String scientificName, @NotNull Integer initialScore) {
		this.id = id;
		this.name = name;
		this.scientificName = scientificName;
		this.initialScore = initialScore;
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

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public Integer getInitialScore() {
		return initialScore;
	}

	public void setInitialScore(Integer initialScore) {
		this.initialScore = initialScore;
	}

	@Override
	public String toString() {
		return "Fish [id=" + id + ", name=" + name + ", scientificName=" + scientificName + ", initialScore="
				+ initialScore + "]";
	}
}
