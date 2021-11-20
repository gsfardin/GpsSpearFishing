package com.gpsfishing.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.gpsfishing.model.enums.FloorType;

@Entity
public class FishingPlace {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@NotBlank
	private String name;
	private String latitude;
	private String longitude;
	@NotNull
	private Integer minDepth;
	@NotNull
	private Integer maxDepth;
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private FloorType floorType;
	@NotNull
	@ManyToOne
	private Country country;
	@NotNull
	@ManyToOne
	private State state;
	@NotNull
	@ManyToOne
	private City city;
	
	public FishingPlace() {}

	public FishingPlace(Long id, @NotNull @NotBlank String name, String latitude, String longitude,
			@NotNull Integer minDepth, @NotNull Integer maxDepth, @NotNull FloorType floorType,
			@NotNull Country country, @NotNull State state, @NotNull City city) {
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.minDepth = minDepth;
		this.maxDepth = maxDepth;
		this.floorType = floorType;
		this.country = country;
		this.state = state;
		this.city = city;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getMinDepth() {
		return minDepth;
	}

	public void setMinDepth(Integer minDepth) {
		this.minDepth = minDepth;
	}

	public Integer getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(Integer maxDepth) {
		this.maxDepth = maxDepth;
	}

	public FloorType getFloorType() {
		return floorType;
	}

	public void setFloorType(FloorType floorType) {
		this.floorType = floorType;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "FishingPlace [id=" + id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", minDepth=" + minDepth + ", maxDepth=" + maxDepth + ", floorType=" + floorType + ", country="
				+ country + ", state=" + state + ", city=" + city + "]";
	}
	
	
}
