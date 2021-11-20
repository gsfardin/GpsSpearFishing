package com.gpsfishing.repository;

import com.gpsfishing.model.Dive;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface DiveRepository extends PageableRepository<Dive, Long> {

}
