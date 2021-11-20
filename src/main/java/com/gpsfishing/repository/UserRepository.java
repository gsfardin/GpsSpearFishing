package com.gpsfishing.repository;

import com.gpsfishing.model.User;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface UserRepository extends PageableRepository<User, Long> {

}
