package com.elearning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int userId;
		private String name;
		private String email;
		private Long phone;
		private String message;
		
		public Contact() {
			
		}


		public Contact(int id, int user_id, String name, String email, Long phone, String message) {
			super();
			this.id = id;
			this.userId = user_id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.message = message;
		}


		public int getUserId() {
			return userId;
		}


		public void setUser_id(int user_id) {
			this.userId = user_id;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}


		@Override
		public String toString() {
			
			return "ID:"+this.id+" | Sender:"+this.userId+" | Receiver:"+this.name+" | Email:"+this.email+" | Message:"+this.message;
		}
		
}
