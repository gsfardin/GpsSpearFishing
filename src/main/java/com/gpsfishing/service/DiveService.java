package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Dive;
import com.gpsfishing.model.FisherProduction;
import com.gpsfishing.repository.DiveRepository;
import com.gpsfishing.repository.FishRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DiveService {
	
	private static final double CATCH_POINTS = 1000;
	private static final double SAWN_PERCENT = 0.30;

	@Inject
	DiveRepository diveRepository;
	
	@Inject
	FishRepository fishRepository;
	
	public Dive findById(@NonNull @NotNull Long id) {
		return diveRepository.findById(id).get();
	}

	public Page<Dive> findAll(Pageable pageable) {
		return diveRepository.findAll(pageable);
	}
	
	public Dive save(Dive dive) {
		
		dive.getFishers().forEach(fisher -> {
			fisher.getFisherProductions().forEach(fisherProduction -> {
				fisherProduction.setScore(getScore(fisherProduction));
			});
		});
		
		return diveRepository.save(dive);
	}

	public Dive update(Dive dive) {
		return diveRepository.update(dive);
	}
	
	public void delete(Dive dive) {
		diveRepository.delete(dive);
	}

	public void deleteById(Long id) {
		diveRepository.deleteById(id);
	}
	
	private Integer getScore(FisherProduction fisherProduction) {
		
		Double score = null;
		
		if(fisherProduction.getFish().getInitialScore() == null) {
			fisherProduction.setFish(fishRepository.findById(fisherProduction.getFish().getId()).get());
		}

		if(fisherProduction.getWeigth() >= fisherProduction.getFish().getInitialScore()) {
			if(fisherProduction.getUserSawns().size() == 0) {
				score = fisherProduction.getWeigth() + CATCH_POINTS;
			} else {
				score = fisherProduction.getWeigth() * SAWN_PERCENT + CATCH_POINTS;
			}
		} 
		return score.intValue();
	}	
}
