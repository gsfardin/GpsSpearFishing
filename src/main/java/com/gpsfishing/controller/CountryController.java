package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Country;
import com.gpsfishing.service.CountryService;

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

@Controller(value = "/country")
public class CountryController {

	@Inject
	CountryService countryService;
	
	@Get("/{id}")
	public Country findById(Long id) {
		return countryService.findById(id);
	}
	
	@Get
	public Page<Country> findAll(Pageable pageable) {
		return countryService.findAll(pageable);
	}
	
	@Post
	public Country save(@Body @NonNull @NotNull Country country) {
		return countryService.save(country);
	}

	@Put
	public Country update(@Body @NonNull @NotNull Country country) {
		return countryService.update(country);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull Country country) {
		countryService.delete(country);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		countryService.deleteById(id);
	}
}
