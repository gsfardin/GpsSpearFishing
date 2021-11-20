package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.State;
import com.gpsfishing.repository.StateRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class StateService {

	@Inject
	StateRepository stateRepository;
	
	public State findById(@NonNull @NotNull Long id) {
		return stateRepository.findById(id).get();
	}

	public Page<State> findAll(Pageable pageable) {
		return stateRepository.findAll(pageable);
	}
	
	public State save(State state) {
		return stateRepository.save(state);
	}

	public State update(State state) {
		return stateRepository.update(state);
	}
	
	public void delete(State state) {
		stateRepository.delete(state);
	}

	public void deleteById(Long id) {
		stateRepository.deleteById(id);
	}
}
