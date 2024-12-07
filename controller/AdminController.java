package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@Controller
public class AdminController {
@Autowired
private  AdminService us;
@GetMapping("Admin")
public ModelAndView admin()
{
	ModelAndView mv =new ModelAndView("Admin");
	return mv;
}

@PostMapping("insertUser1")
public ModelAndView insertUser1(HttpServletRequest request)
{
	String id=request.getParameter("id");
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	
	Admin st=  new Admin();
	st.setId(id);
	st.setName(name);
	st.setPassword(password);
	
	String message=us.AdminRegister(st);
	
	ModelAndView mv= new ModelAndView();
	mv.setViewName("Admin");
	mv.addObject("mes", message);
	return mv;
	
}
}
