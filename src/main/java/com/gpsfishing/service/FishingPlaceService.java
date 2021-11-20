package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FishingPlace;
import com.gpsfishing.repository.FishingPlaceRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FishingPlaceService {

	@Inject
	FishingPlaceRepository fishingPlaceRepository;
	
	public FishingPlace findById(@NonNull @NotNull Long id) {
		return fishingPlaceRepository.findById(id).get();
	}

	public Page<FishingPlace> findAll(Pageable pageable) {
		return fishingPlaceRepository.findAll(pageable);
	}
	
	public FishingPlace save(FishingPlace fishingPlace) {
		return fishingPlaceRepository.save(fishingPlace);
	}

	public FishingPlace update(FishingPlace fishingPlace) {
		return fishingPlaceRepository.update(fishingPlace);
	}
	
	public void delete(FishingPlace fishingPlace) {
		fishingPlaceRepository.delete(fishingPlace);
	}

	public void deleteById(Long id) {
		fishingPlaceRepository.deleteById(id);
	}
}
