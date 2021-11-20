package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FishProduction;
import com.gpsfishing.repository.FishProductionRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FishProductionService {

	@Inject
	FishProductionRepository fishProductionRepository;
	
	public FishProduction findById(@NonNull @NotNull Long id) {
		return fishProductionRepository.findById(id).get();
	}

	public Page<FishProduction> findAll(Pageable pageable) {
		return fishProductionRepository.findAll(pageable);
	}
	
	public FishProduction save(FishProduction fishProduction) {
		return fishProductionRepository.save(fishProduction);
	}

	public FishProduction update(FishProduction fishProduction) {
		return fishProductionRepository.update(fishProduction);
	}
	
	public void delete(FishProduction fishProduction) {
		fishProductionRepository.delete(fishProduction);
	}

	public void deleteById(Long id) {
		fishProductionRepository.deleteById(id);
	}
}
