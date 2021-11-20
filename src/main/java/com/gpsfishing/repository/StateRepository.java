package com.gpsfishing.repository;

import com.gpsfishing.model.State;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface StateRepository extends PageableRepository<State, Long> {

}
