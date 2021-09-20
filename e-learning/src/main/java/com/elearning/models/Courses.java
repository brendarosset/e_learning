package com.elearning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String course_name;
	private String course_resource;
	private String course_desc;
	private String course_fee;
	
	public Courses() {
		
	}


	public Courses(String course_name, String course_resource, String course_desc, String course_fee) {
		super();
		this.course_name = course_name;
		this.course_resource = course_resource;
		this.course_desc = course_desc;
		this.course_fee = course_fee;
	}


	public Courses(int courseId, String course_name, String course_resource, String course_desc, String course_fee) {
		super();
		this.courseId = courseId;
		this.course_name = course_name;
		this.course_resource = course_resource;
		this.course_desc = course_desc;
		this.course_fee = course_fee;
	}



	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
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


	@Override
	public String toString() {
		
		return "ID:"+this.courseId+" | Name:"+this.course_name+" | Description:"+this.course_desc+" | :"+this.course_fee+" | Resource:"+this.course_resource;
	}
		
}
