package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.City;
import com.gpsfishing.repository.CityRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class CityService {

	@Inject
	CityRepository cityRepository;
	
	public City findById(@NonNull @NotNull Long id) {
		return cityRepository.findById(id).get();
	}

	public Page<City> findAll(Pageable pageable) {
		return cityRepository.findAll(pageable);
	}
	
	public City save(City city) {
		return cityRepository.save(city);
	}

	public City update(City city) {
		return cityRepository.update(city);
	}
	
	public void delete(City city) {
		cityRepository.delete(city);
	}

	public void deleteById(Long id) {
		cityRepository.deleteById(id);
	}
}
