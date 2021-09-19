package com.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{
	

}