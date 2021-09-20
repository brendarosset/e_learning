package com.elearning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fee_id;
	private String name;
	private String feedback;
	private int user_id;
	private String email;
	
	public Feedback() {
		
	}
	

	public Feedback(String name, String feedback, int user_id, String email) {
		super();
		this.name = name;
		this.feedback = feedback;
		this.user_id = user_id;
		this.email = email;
	}

	public Feedback(int fee_id, String name, String feedback, int user_id, String email) {
		super();
		this.fee_id = fee_id;
		this.name = name;
		this.feedback = feedback;
		this.user_id = user_id;
		this.email = email;
	}




	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getFee_id() {
		return fee_id;
	}

	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@Override
	public String toString() {
		
		return "ID:"+this.fee_id+" | User:"+this.name+" | User's email:"+this.email+" | Feedback:"+this.feedback;
	}
	
	
}
