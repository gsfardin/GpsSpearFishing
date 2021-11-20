package com.gpsfishing.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.gpsfishing.model.enums.BeaufortScale;
import com.gpsfishing.model.enums.MoonPhase;
import com.gpsfishing.model.enums.WindRose;

import io.micronaut.core.annotation.Nullable;

@Entity
public class Dive {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private Date dateDive;
	@NotNull
	private Timestamp initialDiveHour;
	@NotNull
	private Timestamp finalDiveHour;
	@NotNull
	private Integer visibility;
	@Nullable
	private Integer temperatura;
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private MoonPhase moonPhase;
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private WindRose windDirection;
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private WindRose seaDirection;
	@Enumerated(EnumType.ORDINAL)
	private BeaufortScale seaCondition;
	@NotNull
	@ManyToOne
	private FishingPlace fishingPlace;
	@NotNull
	@OneToMany(mappedBy = "dive")
	private List<Fisher> fishers = new ArrayList<>();
	
	public Dive() {}

	public Dive(Long id, @NotNull Date dateDive, @NotNull Timestamp initialDiveHour, @NotNull Timestamp finalDiveHour,
			@NotNull Integer visibility, Integer temperatura, @NotNull MoonPhase moonPhase,
			@NotNull WindRose windDirection, @NotNull WindRose seaDirection, BeaufortScale seaCondition,
			@NotNull FishingPlace fishingPlace, @NotNull List<Fisher> fishers) {
		super();
		this.id = id;
		this.dateDive = dateDive;
		this.initialDiveHour = initialDiveHour;
		this.finalDiveHour = finalDiveHour;
		this.visibility = visibility;
		this.temperatura = temperatura;
		this.moonPhase = moonPhase;
		this.windDirection = windDirection;
		this.seaDirection = seaDirection;
		this.seaCondition = seaCondition;
		this.fishingPlace = fishingPlace;
		this.fishers = fishers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDive() {
		return dateDive;
	}

	public void setDateDive(Date dateDive) {
		this.dateDive = dateDive;
	}

	public Timestamp getInitialDiveHour() {
		return initialDiveHour;
	}

	public void setInitialDiveHour(Timestamp initialDiveHour) {
		this.initialDiveHour = initialDiveHour;
	}

	public Timestamp getFinalDiveHour() {
		return finalDiveHour;
	}

	public void setFinalDiveHour(Timestamp finalDiveHour) {
		this.finalDiveHour = finalDiveHour;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}

	public MoonPhase getMoonPhase() {
		return moonPhase;
	}

	public void setMoonPhase(MoonPhase moonPhase) {
		this.moonPhase = moonPhase;
	}

	public WindRose getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(WindRose windDirection) {
		this.windDirection = windDirection;
	}

	public WindRose getSeaDirection() {
		return seaDirection;
	}

	public void setSeaDirection(WindRose seaDirection) {
		this.seaDirection = seaDirection;
	}

	public BeaufortScale getSeaCondition() {
		return seaCondition;
	}

	public void setSeaCondition(BeaufortScale seaCondition) {
		this.seaCondition = seaCondition;
	}

	public FishingPlace getFishingPlace() {
		return fishingPlace;
	}

	public void setFishingPlace(FishingPlace fishingPlace) {
		this.fishingPlace = fishingPlace;
	}

	public List<Fisher> getFishers() {
		return fishers;
	}

	public void setFishers(List<Fisher> fishers) {
		this.fishers = fishers;
	}

	@Override
	public String toString() {
		return "Dive [id=" + id + ", dateDive=" + dateDive + ", initialDiveHour=" + initialDiveHour + ", finalDiveHour="
				+ finalDiveHour + ", visibility=" + visibility + ", temperatura=" + temperatura + ", moonPhase="
				+ moonPhase + ", windDirection=" + windDirection + ", seaDirection=" + seaDirection + ", seaCondition="
				+ seaCondition + ", fishingPlace=" + fishingPlace + ", fishers=" + fishers + "]";
	}
}
