package com.gpsfishing.repository;

import com.gpsfishing.model.Fisher;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface FisherRepository extends PageableRepository<Fisher, Long> {

}
