package com.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.Contact;
import com.elearning.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository conRep;

	public List<Contact> findContacts(int user_id) {
		List<Contact> idsList=conRep.findByUserId(user_id);
		return idsList;
	}

	public void addContact(Contact contact) {
		conRep.save(contact);
	}

	public List<Contact> findAllContact() {
		return conRep.findAll();
	}
	
}
