package com.elearning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	private int userId;
	private String course_name;
	private String course_resource;
	private String course_desc;
	private String course_fee;
	
	public Courses() {
		
	}

	public Courses(int userId, String course_name, String course_resource, String course_desc, String course_fee) {
		super();
		this.userId=userId;
		this.course_name = course_name;
		this.course_resource = course_resource;
		this.course_desc = course_desc;
		this.course_fee = course_fee;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_resource() {
		return course_resource;
	}

	public void setCourse_resource(String course_resource) {
		this.course_resource = course_resource;
	}

	public String getCourse_desc() {
		return course_desc;
	}

	public void setCourse_desc(String course_desc) {
		this.course_desc = course_desc;
	}

	public String getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(String course_fee) {
		this.course_fee = course_fee;
	}
	
	
}
