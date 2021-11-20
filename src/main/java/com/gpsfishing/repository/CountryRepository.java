package com.gpsfishing.repository;

import com.gpsfishing.model.Country;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface CountryRepository extends PageableRepository<Country, Long> {

}
