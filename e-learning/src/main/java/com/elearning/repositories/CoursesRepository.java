package com.elearning.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.Courses;

public interface CoursesRepository extends JpaRepository<Courses,Integer>{

	List<Courses> findByCourseId(int user_id);
	

}