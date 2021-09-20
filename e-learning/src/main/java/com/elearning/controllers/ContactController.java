package com.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.elearning.models.Contact;
import com.elearning.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService conSer;
	
	@GetMapping("/contacts/{user_id}/{name}")
	public String contacts(Model model,@PathVariable int user_id,@PathVariable String name){
		List<Contact> contacts=conSer.findContacts(user_id);	
		model.addAttribute("contacts",contacts);
		model.addAttribute("name",name);
		return "contacts";			
	}
	@GetMapping("/addContact/{user_id}/{name}")
	public String contactData(Model model,@PathVariable int user_id,@PathVariable String name) {
		
		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "addContact";
	}
	@PostMapping("/addContact/{name}")
	public String addContact(Model model,Contact contact,@PathVariable String name) {
		if(contact.getName()!=null) {
			conSer.addContact(contact);
			model.addAttribute("user_id", contact.getUserId());
			model.addAttribute("name",name);
			return "contactAdded";
		}else {
			return "contactAddedError";
		}
		
	}
}
