package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.Dive;
import com.gpsfishing.service.DiveService;

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

@Controller(value = "/dive")
public class DiveController {

	@Inject
	DiveService diveService;
	
	@Get("/{id}")
	public Dive findById(Long id) {
		return diveService.findById(id);
	}
	
	@Get
	public Page<Dive> findAll(Pageable pageable) {
		return diveService.findAll(pageable);
	}
	
	@Post
	public Dive save(@Body @NonNull @NotNull Dive dive) {
		return diveService.save(dive);
	}

	@Put
	public Dive update(@Body @NonNull @NotNull Dive dive) {
		return diveService.update(dive);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull Dive dive) {
		diveService.delete(dive);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		diveService.deleteById(id);
	}
}
