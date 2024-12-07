package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.userRepository;

@Service
public class userServiceimpl {
	
	@Autowired
	private userRepository userRepo;
	
	public String userRegister(student std)
	{
		userRepo.save(std);
		return "Register sucessful";
	}

	public student checklogin(String username, String password) {
		// TODO Auto-generated method stub
		return userRepo.checklogin(username, password);
	}
	

	public student checklogin1(String username, String password) {
		// TODO Auto-generated method stub
		return  userRepo.checklogin1(username, password); 
	}
	
	

}
