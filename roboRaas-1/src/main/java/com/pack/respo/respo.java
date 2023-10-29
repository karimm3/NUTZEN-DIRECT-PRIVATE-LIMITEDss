package com.pack.respo;

import org.springframework.data.repository.CrudRepository;

import com.pack.jwt.entitys.User;

public interface respo extends CrudRepository<User, String>{

	User findByEmail(String username);

}
