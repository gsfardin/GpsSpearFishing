package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.City;
import com.gpsfishing.service.CityService;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;

@Controller(value = "/city")
public class CityController {

	@Inject
	CityService cityService;
	
	@Get("/{id}")
	public City findById(Long id) {
		return cityService.findById(id);
	}
	
	@Get
	public Page<City> findAll(Pageable pageable) {
		return cityService.findAll(pageable);
	}
	
	@Post
	public City save(@Body @NonNull @NotNull City city) {
		return cityService.save(city);
	}

	@Put
	public City update(@Body @NonNull @NotNull City city) {
		return cityService.update(city);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull City city) {
		cityService.delete(city);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		cityService.deleteById(id);
	}
}
