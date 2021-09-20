package com.elearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearning.models.Feedback;
import com.elearning.services.FeedbackService;

@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedServ;
	
	@GetMapping("/addFeedback/{user_id}/{name}")
	public String feedbackData(Model model,@PathVariable int user_id,@PathVariable String name){
		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "addFeedback";
	}
	@GetMapping("/addFeedback")
	public String addFeedback(Model model,@RequestParam int user_id,@RequestParam String name,@RequestParam String feedback, @RequestParam String email){
		feedServ.addFeedback(new Feedback(name,feedback,user_id,email));
		model.addAttribute("user_id", user_id);
		return "feedbackAdded";
	}
	
}
