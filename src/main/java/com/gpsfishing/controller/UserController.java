package com.gpsfishing.controller;

import javax.validation.constraints.NotNull;

import com.gpsfishing.model.User;
import com.gpsfishing.service.UserService;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;

@Controller(value = "/user")
public class UserController {

	@Inject
	UserService userService;
	
	@Get("/{id}")
	public User findById(Long id) {
		return userService.findById(id);
	}
	
	@Get
	public Page<User> findAll(Pageable pageable) {
		return userService.findAll(pageable);
	}
	
	@Post
	public User save(@Body @NonNull @NotNull User user) {
		return userService.save(user);
	}

	@Put
	public User update(@Body @NonNull @NotNull User user) {
		return userService.update(user);
	}
	
	@Delete
	public void delete(@Body @NonNull @NotNull User user) {
		userService.delete(user);
	}

	@Delete("/{id}")
	public void deleteById(@PathVariable Long id) {
		userService.deleteById(id);
	}
}
