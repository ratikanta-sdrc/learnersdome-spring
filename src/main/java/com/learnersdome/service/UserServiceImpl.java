package com.learnersdome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnersdome.domain.User;
import com.learnersdome.model.UserModel;
import com.learnersdome.repository.UserRepository;
import com.learnersdome.util.DomainToModel;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private DomainToModel entityToModel;
    
    @Override
    public void save(User user) {        
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	@Override
	public List<UserModel> findAll() {
		
		List<User> users = (List<User>) userRepository.findAll();
		return entityToModel.convertUserList(users);
	}
}
