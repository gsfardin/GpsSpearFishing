package com.gpsfishing.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Fisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@ManyToOne
	private User user;
	@NotNull
	@ManyToOne
	private Dive dive;
	@OneToMany(mappedBy = "fisher")
	private List<FishProduction> fishProductions;
	
	public Fisher() {}

	public Fisher(Long id, @NotNull User user, @NotNull Dive dive, List<FishProduction> fishProductions) {
		super();
		this.id = id;
		this.user = user;
		this.dive = dive;
		this.fishProductions = fishProductions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dive getDive() {
		return dive;
	}

	public void setDive(Dive dive) {
		this.dive = dive;
	}

	public List<FishProduction> getFishProductions() {
		return fishProductions;
	}

	public void setFishProductions(List<FishProduction> fishProductions) {
		this.fishProductions = fishProductions;
	}

	@Override
	public String toString() {
		return "Fisher [id=" + id + ", user=" + user + ", dive=" + dive + ", fishProductions=" + fishProductions + "]";
	}
}
