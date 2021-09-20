package com.elearning.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.Admin;
import com.elearning.repositories.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository admRep;
	public Admin findAdmin(int admin_id) {

		return admRep.findById(admin_id).get() ;
		
	}
	public Admin findAdmin(int admin_id, String password) {
		if(admRep.findById(admin_id).isEmpty()) {
			return null;
		}else {
			if(admRep.findById(admin_id).get().getPassword().equals(password)) {
				return admRep.findById(admin_id).get() ;
				}else {
					return null;
				}
		}
	}
}
