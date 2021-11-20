package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Dive;
import com.gpsfishing.repository.DiveRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DiveService {

	@Inject
	DiveRepository diveRepository;
	
	public Dive findById(@NonNull @NotNull Long id) {
		return diveRepository.findById(id).get();
	}

	public Page<Dive> findAll(Pageable pageable) {
		return diveRepository.findAll(pageable);
	}
	
	public Dive save(Dive dive) {
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
}
