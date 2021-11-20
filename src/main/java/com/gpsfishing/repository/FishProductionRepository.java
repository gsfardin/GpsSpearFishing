package com.gpsfishing.repository;

import com.gpsfishing.model.FishProduction;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface FishProductionRepository extends PageableRepository<FishProduction, Long> {

}
