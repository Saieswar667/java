package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
@Autowired
private AdminRepository AdminRepo;

public String AdminRegister(Admin st)
{
	AdminRepo.save(st);
	return "Register sucessful";
}
}
