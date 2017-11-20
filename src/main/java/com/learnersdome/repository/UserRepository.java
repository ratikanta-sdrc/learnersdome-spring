package com.learnersdome.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnersdome.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);	
	
}
