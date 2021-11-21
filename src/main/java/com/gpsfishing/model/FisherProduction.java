package com.gpsfishing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.micronaut.core.annotation.Nullable;

@Entity
public class FisherProduction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	private Fisher fisher;
	
	@NotNull
	@ManyToOne
	private Fish fish;
	
	@NotNull
	private Integer weigth;
	@NotNull
	private Integer score = 0;
	
	@Nullable
	@ManyToMany(fetch = FetchType.EAGER)
	private List<User> userSawns = new ArrayList<>();
	
	public FisherProduction() {}

	public FisherProduction(Long id, Fisher fisher, @NotNull Fish fish, @NotNull Integer weigth, @NotNull Integer score,
			List<User> userSawns) {
		super();
		this.id = id;
		this.fisher = fisher;
		this.fish = fish;
		this.weigth = weigth;
		this.score = score;
		this.userSawns = userSawns;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fisher getFisher() {
		return fisher;
	}

	public void setFisher(Fisher fisher) {
		this.fisher = fisher;
	}

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	public Integer getWeigth() {
		return weigth;
	}

	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}
	
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public List<User> getUserSawns() {
		return userSawns;
	}

	public void setUserSawns(List<User> userSawns) {
		this.userSawns = userSawns;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FisherProduction other = (FisherProduction) obj;
		return Objects.equals(id, other.id);
	}
}
