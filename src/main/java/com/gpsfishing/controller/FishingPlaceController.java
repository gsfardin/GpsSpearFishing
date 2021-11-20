package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.FishingPlace;
import com.gpsfishing.service.FishingPlaceService;

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

@Controller(value = "/fishingPlace")
public class FishingPlaceController {

	@Inject
	FishingPlaceService fishingPlaceService;
	
	@Get("/{id}")
	public FishingPlace findById(Long id) {
		return fishingPlaceService.findById(id);
	}
	
	@Get
	public Page<FishingPlace> findAll(Pageable pageable) {
		return fishingPlaceService.findAll(pageable);
	}
	
	@Post
	public FishingPlace save(@Body @NonNull @NotNull FishingPlace fishingPlace) {
		return fishingPlaceService.save(fishingPlace);
	}

	@Put
	public FishingPlace update(@Body @NonNull @NotNull FishingPlace fishingPlace) {
		return fishingPlaceService.update(fishingPlace);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull FishingPlace fishingPlace) {
		fishingPlaceService.delete(fishingPlace);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		fishingPlaceService.deleteById(id);
	}
}
