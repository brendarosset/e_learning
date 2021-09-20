package com.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.Courses;
import com.elearning.repositories.CoursesRepository;

@Service
public class CoursesService {

	@Autowired
	CoursesRepository courRep;
	public List<Courses> findCourses(int user_id) {
		List<Courses> coursesList=courRep.findByCourseId(user_id);
		return coursesList;
	}
	public void addCourse(Courses course) {
		courRep.save(course);
		
	}
	public Courses findCourse(int courseId) {
		return courRep.findById(courseId).get();
	}
	public List<Courses> findAllCourses() {
		return courRep.findAll();
	}
	

}
