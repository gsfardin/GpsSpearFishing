package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FishProduction;
import com.gpsfishing.service.FishProductionService;

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

@Controller(value = "/fishProduction")
public class FishProductionController {

	@Inject
	FishProductionService fishProductionService;
	
	@Get("/{id}")
	public FishProduction findById(Long id) {
		return fishProductionService.findById(id);
	}
	
	@Get
	public Page<FishProduction> findAll(Pageable pageable) {
		return fishProductionService.findAll(pageable);
	}
	
	@Post
	public FishProduction save(@Body @NonNull @NotNull FishProduction fishProduction) {
		return fishProductionService.save(fishProduction);
	}

	@Put
	public FishProduction update(@Body @NonNull @NotNull FishProduction fishProduction) {
		return fishProductionService.update(fishProduction);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull FishProduction fishProduction) {
		fishProductionService.delete(fishProduction);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		fishProductionService.deleteById(id);
	}
}
