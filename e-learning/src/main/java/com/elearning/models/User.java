package com.elearning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity //maps this class to the DB table
//class=table name
public class User {
	
	@Id  //makes the id primary key
	//unique
	private int user_id;
	private String name;
	private String adress;
	private String password;
	private String email;
	private Long phone;
	//private upload_photo;
	
	public User() {
		
	}
	
	
	public User(int user_id, String password) {
		super();
		this.user_id = user_id;
		this.password = password;
	}


	public User(int user_id,String name, String adress, String password, String email, Long phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public Long getPhone() {
		return phone;
	}
	
	
}
