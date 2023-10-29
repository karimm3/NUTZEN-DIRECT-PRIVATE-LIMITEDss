package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pack.jwt.entitys.User;
import com.pack.respo.respo;

@Service
public class CustomUservice implements UserDetailsService {

	@Autowired
	respo respo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 User s=	respo.findByEmail(username);
		return s;
	}

}
