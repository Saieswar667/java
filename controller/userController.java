package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.student;
import com.example.demo.service.userServiceimpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@Controller
public class userController {
	
	
	/*
	 * @GetMapping("/") public String home() { return "welcome home"; }
	 */
	@Autowired
	private  userServiceimpl us;

	@GetMapping("chaitu")
	public String welcome()
	{
		return "chaitanya";
	}
	
	@GetMapping("/")
	public ModelAndView homepage()
	{
		ModelAndView mv=new ModelAndView();
				mv.setViewName("home");
				return mv;
	}
	
	
	@GetMapping("register")
	public ModelAndView register()
	{
		ModelAndView mv =new ModelAndView("registerpage");
		return mv;
	}
	
	@PostMapping("insertUser")
	public ModelAndView insertUser(HttpServletRequest request)
	{
		String id=request.getParameter("id");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		student st=  new student();
		st.setId(id);
		st.setName(name);
		st.setPassword(password);
		
		String message=us.userRegister(st);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("registerpage");
		mv.addObject("mes", message);
		return mv;
		
	}
	
	@GetMapping("student")
	public ModelAndView student()
	{
		ModelAndView mv =new ModelAndView("student");
		return mv;
	}
	@GetMapping("login")
	public ModelAndView login()
	{
		ModelAndView mv =new ModelAndView("login");
		return mv;
	}
	
	@PostMapping("checklogin")
	public ModelAndView checklogin(HttpServletRequest request)
	{
		ModelAndView mv= new ModelAndView();
		
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		
		student st=us.checklogin(username,password);
		
		if(st!=null)
		{
			mv.setViewName("userhome");
		}
		else
		{
			mv.setViewName("error");
		}
		return mv;
	}
	
	@GetMapping("CoustmerLogin")
	public ModelAndView CoustmerLogin()
	{
		ModelAndView mv =new ModelAndView("CoustmerLogin");
		return mv;
	}
	
	@PostMapping("checklogin1")
	public ModelAndView checklogin1(HttpServletRequest request)
	{
		ModelAndView mv= new ModelAndView();
		
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		
		student st=us.checklogin1(username,password);
		
		if(st!=null)
		{
			mv.setViewName("coustmerhome");
		}
		else
		{
			mv.setViewName("error");
		}
		return mv;
	}

}
