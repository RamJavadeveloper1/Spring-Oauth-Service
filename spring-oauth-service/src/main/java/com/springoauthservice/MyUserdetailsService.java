package com.springoauthservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserdetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepositoty userRepositoty;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepositoty.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found in Database");
		}
		return new UserPrinicipal(user);
	}

}
