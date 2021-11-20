package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Fisher;
import com.gpsfishing.service.FisherService;

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

@Controller(value = "/fisher")
public class FisherController {

	@Inject
	FisherService fisherService;
	
	@Get("/{id}")
	public Fisher findById(Long id) {
		return fisherService.findById(id);
	}
	
	@Get
	public Page<Fisher> findAll(Pageable pageable) {
		return fisherService.findAll(pageable);
	}
	
	@Post
	public Fisher save(@Body @NonNull @NotNull Fisher fisher) {
		return fisherService.save(fisher);
	}

	@Put
	public Fisher update(@Body @NonNull @NotNull Fisher fisher) {
		return fisherService.update(fisher);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull Fisher fisher) {
		fisherService.delete(fisher);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		fisherService.deleteById(id);
	}
}
