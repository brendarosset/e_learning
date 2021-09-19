package com.elearning.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.Contact;


public interface ContactRepository extends JpaRepository<Contact,Integer>{

	List<Contact> findByUserId(int user_id);

}