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
	//private int user_id;
	//private String email;
	
	public Feedback() {
		
	}
	

	public Feedback(String name, String feedback) {
		super();
		this.name = name;
		this.feedback = feedback;
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
	
}
