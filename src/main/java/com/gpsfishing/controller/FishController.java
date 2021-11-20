package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Fish;
import com.gpsfishing.service.FishService;

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

@Controller(value = "/fish")
public class FishController {

	@Inject
	FishService fishService;
	
	@Get("/{id}")
	public Fish findById(Long id) {
		return fishService.findById(id);
	}
	
	@Get
	public Page<Fish> findAll(Pageable pageable) {
		return fishService.findAll(pageable);
	}
	
	@Post
	public Fish save(@Body @NonNull @NotNull Fish fish) {
		return fishService.save(fish);
	}

	@Put
	public Fish update(@Body @NonNull @NotNull Fish fish) {
		return fishService.update(fish);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull Fish fish) {
		fishService.delete(fish);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		fishService.deleteById(id);
	}
}
