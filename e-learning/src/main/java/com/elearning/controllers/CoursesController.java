package com.elearning.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearning.models.CourseUser;
import com.elearning.models.Courses;
import com.elearning.services.CourseUserService;
import com.elearning.services.CoursesService;

@Controller
public class CoursesController {
	@Autowired
	CoursesService courServ;
	@Autowired
	CourseUserService coUSer;
	
	@GetMapping("/courses/{user_id}/{name}")
	public String courses(Model model,@PathVariable int user_id,@PathVariable String name){
		List<CourseUser> cour_user=coUSer.findCourses(user_id);	
		List<Courses> courses= new ArrayList<>();
		for(CourseUser courU:cour_user) {
			courses.add(courServ.findCourse(courU.getCourseId()));
		}
		model.addAttribute("courses",courses);
		model.addAttribute("name",name);
		return "courses";
	}
	@GetMapping("/searchCourse/{user_id}/{name}")
	public String courseData(Model model,@PathVariable int user_id,@PathVariable String name) {	
		model.addAttribute("user_id", user_id);
		model.addAttribute("name", name);
		return "searchCourse";
	}
	@GetMapping("/addCourse")
	public String searchCourse(Model model,@RequestParam int userId,@RequestParam int courseId) {
			Courses course=courServ.findCourse(courseId);
			System.out.println("course"+course);
			model.addAttribute("user_id",userId);
			model.addAttribute("course", course);
			return "addCourse";
			
	}
	@GetMapping("/courseAdded/{user_id}/{courseId}")
	public String courseAdded(Model model,@PathVariable int user_id,@PathVariable int courseId) {
		coUSer.addCourse(new CourseUser(user_id,courseId));
		model.addAttribute("user_id", user_id);
		return "courseAdded";
	}
}
