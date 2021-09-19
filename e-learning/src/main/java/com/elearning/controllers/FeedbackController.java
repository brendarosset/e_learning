package com.elearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.elearning.services.FeedbackService;

public class FeedbackController {
	
	@Autowired
	FeedbackService feedServ;
	
	@GetMapping("/addFeedback/{user_id}/{name}")
	public String feedbackData(Model model,@PathVariable int user_id,@PathVariable String name){

		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "addFeedback";
	}
	@PostMapping("/addFeedback/{user_id}/{name}")
	public String feedbackData(Model model,@PathVariable int user_id,@PathVariable String name){

		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "addFeedback";
	}
	
}
