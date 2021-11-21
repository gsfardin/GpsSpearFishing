package com.gpsfishing.repository;

import com.gpsfishing.model.FisherProduction;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface FisherProductionRepository extends PageableRepository<FisherProduction, Long> {

}
