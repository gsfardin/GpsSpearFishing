package com.gpsfishing.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.core.annotation.Nullable;

@Entity
public class FishProduction {
	private static final Integer CATCH_POINTS = 1000;
	private static final Integer SAWN_PERCENT = 30;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Fisher fisher;
	@NotNull
	@ManyToOne
	@JsonIgnore
	private Fish fish;
//	@NotNull
	private Integer weigth;
	@Nullable
	@ManyToMany
	private List<User> userSawns = new ArrayList<>();
	
	public FishProduction() {}

	public FishProduction(Long id, Fisher fisher, @NotNull Fish fish, @NotNull Integer weigth, List<User> userSawns) {
		super();
		this.id = id;
		this.fisher = fisher;
		this.fish = fish;
		this.weigth = weigth;
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

	public List<User> getUserSawns() {
		return userSawns;
	}

	public void setUserSawns(List<User> userSawns) {
		this.userSawns = userSawns;
	}

//	public Integer getScore() {
//		if(weigth >= fish.getInitialScore()) {
//			if(userSawns.size() == 0) {
//				return weigth + CATCH_POINTS;
//			} else {
//				return weigth * (1 - (SAWN_PERCENT/100));
//			}
//		} else {
//			return 0;
//		}
//	}
}
