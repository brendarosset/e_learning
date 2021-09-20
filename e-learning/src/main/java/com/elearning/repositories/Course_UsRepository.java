package com.elearning.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.CourseUser;

public interface Course_UsRepository extends JpaRepository<CourseUser,Integer>{

	List<CourseUser> findAllByUserId(int user_id);
	

}
