package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FisherProduction;
import com.gpsfishing.repository.FisherProductionRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FisherProductionService {

	@Inject
	FisherProductionRepository fisherProductionRepository;
	
	public FisherProduction findById(@NonNull @NotNull Long id) {
		return fisherProductionRepository.findById(id).get();
	}

	public Page<FisherProduction> findAll(Pageable pageable) {
		return fisherProductionRepository.findAll(pageable);
	}
	
	public FisherProduction save(FisherProduction fisherProduction) {
		return fisherProductionRepository.save(fisherProduction);
	}

	public FisherProduction update(FisherProduction fisherProduction) {
		return fisherProductionRepository.update(fisherProduction);
	}
	
	public void delete(FisherProduction fisherProduction) {
		fisherProductionRepository.delete(fisherProduction);
	}

	public void deleteById(Long id) {
		fisherProductionRepository.deleteById(id);
	}
}
