package com.gpsfishing.service;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.User;
import com.gpsfishing.repository.UserRepository;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class UserService {

	@Inject
	UserRepository userRepository;
	
	public User findById(@NonNull @NotNull Long id) {
		return userRepository.findById(id).get();
	}

	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

	public User update(User user) {
		return userRepository.update(user);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}

	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
}
