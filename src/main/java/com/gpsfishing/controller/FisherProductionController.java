package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FisherProduction;
import com.gpsfishing.service.FisherProductionService;

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

@Controller(value = "/fisherProduction")
public class FisherProductionController {

	@Inject
	FisherProductionService fisherProductionService;
	
	@Get("/{id}")
	public FisherProduction findById(Long id) {
		return fisherProductionService.findById(id);
	}
	
	@Get
	public Page<FisherProduction> findAll(Pageable pageable) {
		return fisherProductionService.findAll(pageable);
	}
	
	@Post
	public FisherProduction save(@Body @NonNull @NotNull FisherProduction fisherProduction) {
		return fisherProductionService.save(fisherProduction);
	}

	@Put
	public FisherProduction update(@Body @NonNull @NotNull FisherProduction fisherProduction) {
		return fisherProductionService.update(fisherProduction);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull FisherProduction fisherProduction) {
		fisherProductionService.delete(fisherProduction);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		fisherProductionService.deleteById(id);
	}
}
