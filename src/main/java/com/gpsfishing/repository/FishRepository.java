package com.gpsfishing.repository;

import com.gpsfishing.model.Fish;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface FishRepository extends PageableRepository<Fish, Long> {

}
