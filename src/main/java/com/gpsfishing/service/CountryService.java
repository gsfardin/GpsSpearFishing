package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Country;
import com.gpsfishing.repository.CountryRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class CountryService {

	@Inject
	CountryRepository countryRepository;
	
	public Country findById(@NonNull @NotNull Long id) {
		return countryRepository.findById(id).get();
	}

	public Page<Country> findAll(Pageable pageable) {
		return countryRepository.findAll(pageable);
	}
	
	public Country save(Country country) {
		return countryRepository.save(country);
	}

	public Country update(Country country) {
		return countryRepository.update(country);
	}
	
	public void delete(Country country) {
		countryRepository.delete(country);
	}

	public void deleteById(Long id) {
		countryRepository.deleteById(id);
	}
}
