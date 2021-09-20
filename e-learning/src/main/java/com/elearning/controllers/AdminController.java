package com.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearning.models.Admin;
import com.elearning.models.Contact;
import com.elearning.models.Courses;
import com.elearning.models.Feedback;
import com.elearning.models.User;
import com.elearning.services.AdminService;
import com.elearning.services.ContactService;
import com.elearning.services.CoursesService;
import com.elearning.services.FeedbackService;
import com.elearning.services.UserService;

@Controller
public class AdminController {

	@Autowired
	AdminService admSer;
	@Autowired
	UserService userSer;
	@Autowired 
	FeedbackService feedSer;
	@Autowired
	CoursesService courSer;
	@Autowired
	ContactService conSer;
	
	@GetMapping("/adminLogin")
	public String adminLogin(){
		return "adminLogin";
	}
	@PostMapping("/adminMain")
	public String adminLoginPost(Model model, Admin admin){
		Admin adminDB=admSer.findAdmin(admin.getAdmin_id(),admin.getPassword());
		if(adminDB!=null) {		
			model.addAttribute("admin",adminDB);
			return "adminMain";
		}else {
			return "userError";
		}
	}
	@GetMapping("/adminMain/{admin_id}")
	public String adminMain(Model model, @PathVariable int admin_id){
		model.addAttribute("admin",admSer.findAdmin(admin_id));
		return "adminMain";
	}

	@GetMapping("/users/{admin_id}")
	public String showUsers(Model model,@PathVariable int admin_id) {
		List<User> users=userSer.findAllUsers();	
		model.addAttribute("items",users);
		model.addAttribute("admin_id",admin_id);
		return "ShowItems";
	}
	@GetMapping("/feedback/{admin_id}")
	public String showFeedback(Model model,@PathVariable int admin_id) {
		List<Feedback> feedbacks=feedSer.findAllFeedback();	
		model.addAttribute("items",feedbacks);
		model.addAttribute("admin_id",admin_id);
		return "ShowItems";
	}
	@GetMapping("/courses/{admin_id}")
	public String showCourses(Model model,@PathVariable int admin_id) {
		List<Courses> courses=courSer.findAllCourses();	
		model.addAttribute("items",courses);
		model.addAttribute("admin_id",admin_id);
		return "ShowCourses";
	}
	@GetMapping("/contact/{admin_id}")
	public String showContact(Model model,@PathVariable int admin_id) {
		List<Contact> contacts=conSer.findAllContact();	
		model.addAttribute("items",contacts);
		model.addAttribute("admin_id",admin_id);
		return "ShowItems";
	}
	@GetMapping("/addCourse/{admin_id}")
		public String addCourse(Model model,@PathVariable int admin_id) {
			return "adAddCourse";
		}
	@GetMapping("/adCourseAdded/{admin_id}")
	public String courseAdded(Model model,@PathVariable int admin_id,@RequestParam("name") String name,@RequestParam("resource") String resource,@RequestParam("description") String description,@RequestParam("feedback") String feedback) {
		courSer.addCourse(new Courses(name, resource, description, feedback));
		model.addAttribute("admin_id",admin_id);
		return "adCourseAdded";
	}
	
	
}
