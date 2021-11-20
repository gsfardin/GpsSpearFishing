package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.State;
import com.gpsfishing.service.StateService;

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

@Controller(value = "/state")
public class StateController {

	@Inject
	StateService stateService;
	
	@Get("/{id}")
	public State findById(Long id) {
		return stateService.findById(id);
	}
	
	@Get
	public Page<State> findAll(Pageable pageable) {
		return stateService.findAll(pageable);
	}
	
	@Post
	public State save(@Body @NonNull @NotNull State state) {
		return stateService.save(state);
	}

	@Put
	public State update(@Body @NonNull @NotNull State state) {
		return stateService.update(state);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull State state) {
		stateService.delete(state);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		stateService.deleteById(id);
	}
}
