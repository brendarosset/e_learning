package com.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.CourseUser;
import com.elearning.repositories.Course_UsRepository;
@Service
public class CourseUserService {
	@Autowired
	Course_UsRepository cusRep;
	public List<CourseUser> findCourses(int user_id) {
		return cusRep.findAllByUserId(user_id);
	}
	public void addCourse(CourseUser courseUser) {
		cusRep.save(courseUser);
		
	}
	 
}
