package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Fish;
import com.gpsfishing.repository.FishRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FishService {

	@Inject
	FishRepository fishRepository;
	
	public Fish findById(@NonNull @NotNull Long id) {
		return fishRepository.findById(id).get();
	}

	public Page<Fish> findAll(Pageable pageable) {
		return fishRepository.findAll(pageable);
	}
	
	public Fish save(Fish fish) {
		return fishRepository.save(fish);
	}

	public Fish update(Fish fish) {
		return fishRepository.update(fish);
	}
	
	public void delete(Fish fish) {
		fishRepository.delete(fish);
	}

	public void deleteById(Long id) {
		fishRepository.deleteById(id);
	}
}
