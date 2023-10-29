package com.pack.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pack.jwt.entitys.User;
import com.pack.respo.respo;

@Service
public class UserService {

	
	@Autowired
	respo respo;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public List<User> getUser(){
		return (List<User>) respo.findAll();
	}
	
	public User createUser(User user) {
		user.setId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
	

		return respo.save(user);
	}
}
