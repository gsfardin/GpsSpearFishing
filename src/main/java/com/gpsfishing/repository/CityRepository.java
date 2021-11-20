package com.gpsfishing.repository;

import com.gpsfishing.model.City;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface CityRepository extends PageableRepository<City, Long> {

}
