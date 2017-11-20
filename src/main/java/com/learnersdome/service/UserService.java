package com.learnersdome.service;

import java.util.List;

import com.learnersdome.domain.User;
import com.learnersdome.model.UserModel;

public interface UserService {

	void save(User user);

    User findByUsername(String username);

	List<UserModel> findAll();
}
