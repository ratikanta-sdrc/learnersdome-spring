package com.learnersdome.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learnersdome.domain.User;
import com.learnersdome.model.UserModel;

@Component
public class DomainToModel {

	public List<UserModel> convertUserList(List<User> users) {
		List<UserModel> userModels = new ArrayList<UserModel>();
		users.forEach(user->{
			UserModel userModel = new UserModel();
			userModel.setId(user.getId());
			userModel.setUsername(user.getUsername());
			userModel.setName(user.getName());
			userModel.setSex(user.isSex());
			userModel.setEmail(user.getEmail());
			userModel.setMobile(user.getMobile());
			userModel.setDateOfBirth(user.getDateOfBirth());
			userModels.add(userModel);
		});
		return userModels;
	}

}
