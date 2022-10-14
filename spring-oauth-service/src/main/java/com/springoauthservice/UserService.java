package com.springoauthservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepositoty userRepositoty;

	public User addUser(User user) {
		return userRepositoty.save(user);
		
	}
}
