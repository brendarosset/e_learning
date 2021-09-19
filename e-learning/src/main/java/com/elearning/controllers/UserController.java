package com.elearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.elearning.models.User;
import com.elearning.repositories.UserRepository;
import com.elearning.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/userLogin")
	public String userLogin(){
		return "userLogin";
	}

	@GetMapping("/userRegistry")
	public String registerUser(){
		return "userRegistry";
	}
	@PostMapping("/userRegistry")
	public String saveUser(User user){
		userService.registerUser(user);
		return "userRegistered";
	}
	@PostMapping("/userMain")
	public String userLoginPost(Model model, User user){
		User userDB=userService.findUser(user.getUser_id(),user.getPassword());
		if(userDB!=null) {
			model.addAttribute("name",userDB.getName());
			model.addAttribute("user_id",userDB.getUser_id());
			return "userMain";
		}else {
			return "userError";
		}
	}
	@PostMapping("/userMain/{user_id}/{name}")
	public String userLoginPostwithParams(Model model,@PathVariable int user_id,@PathVariable String name){
			model.addAttribute("name",name);
			model.addAttribute("user_id",user_id);
			return "userMain";
	}
	
	@GetMapping("/messages")
	public String messages(){
		return "messages";
	}
	
}

	