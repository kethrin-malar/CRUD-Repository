package com.insurance.demo.serviceimpl;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.insurance.demo.entity.UserEntity;
	import com.insurance.demo.repository.UserRepository;
	import com.insurance.demo.service.UserService;


	@Service
	public class UserServiceImpl implements UserService{
		
		@Autowired
	    private UserRepository userRepository;

	    @Override
	    public String validateLoginCredentials(String username, String password) {
	        List<UserEntity> users = userRepository.findAll();
	        
	        for (UserEntity user : users) {
	            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	                return "Login successfully";
	            }
	        }
	        
	        return "Invalid username or password";
	    }
	}
	



