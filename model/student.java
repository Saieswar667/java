package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Student_table")
@Entity
public class student {
	
	@Column(name = "Student_id")
	@Id
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false )
	private String password;

	

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
