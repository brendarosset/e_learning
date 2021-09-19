package com.elearning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.exceptions.UserNotFoundException;
import com.elearning.models.User;
import com.elearning.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRep;
	
	public User findUser(int id, String password) {	
		
		if(userRep.findById(id).isEmpty()) {
			return null;
		}else {
			if(userRep.findById(id).get().getPassword().equals(password)) {
				return userRep.findById(id).get() ;
				}else {
					return null;
				}
		}
		
		
	}

	public void registerUser(User user) {
		userRep.save(user);
		
	}

}
