package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Fisher;
import com.gpsfishing.repository.FisherRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FisherService {

	@Inject
	FisherRepository fisherRepository;
	
	public Fisher findById(@NonNull @NotNull Long id) {
		return fisherRepository.findById(id).get();
	}

	public Page<Fisher> findAll(Pageable pageable) {
		return fisherRepository.findAll(pageable);
	}
	
	public Fisher save(Fisher fisher) {
		return fisherRepository.save(fisher);
	}

	public Fisher update(Fisher fisher) {
		return fisherRepository.update(fisher);
	}
	
	public void delete(Fisher fisher) {
		fisherRepository.delete(fisher);
	}

	public void deleteById(Long id) {
		fisherRepository.deleteById(id);
	}
}
