package com.elearning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.elearning.models.Courses;
import com.elearning.services.CoursesService;

@Controller
public class CoursesController {
	@Autowired
	CoursesService courServ;
	
	@GetMapping("/courses/{user_id}/{name}")
	public String courses(Model model,@PathVariable int user_id,@PathVariable String name){
		List<Courses> courses=courServ.findCourses(user_id);	
		model.addAttribute("courses",courses);
		model.addAttribute("name",name);
		return "courses";
	}
	@GetMapping("/addCourse/{user_id}/{name}")
	public String courseData(Model model,@PathVariable int user_id,@PathVariable String name) {
		
		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "addCourse";
	}
	@GetMapping("/addCourse/{user_id}/{name}/{courseId}")
	public String searchCourse(Model model,@PathVariable int user_id,@PathVariable String name,@PathVariable int courseId) {
			Courses course=courServ.findCourse(courseId);
			model.addAttribute("user_id", course.getUserId());
			model.addAttribute("name",name);
			return "courseAdded";
		}
		
	}
}
