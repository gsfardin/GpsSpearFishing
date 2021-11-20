package com.gpsfishing.repository;

import com.gpsfishing.model.FishingPlace;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface FishingPlaceRepository extends PageableRepository<FishingPlace, Long> {

}
