package com.lnsf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lnsf.entities.User;
import com.lnsf.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("user") 
	public ModelAndView selectByExample() {
		ModelAndView  modelAndView =new ModelAndView("user");
		List<User> list =userService.selectByExample(null);
		  modelAndView.addObject("user",list); 
		  return modelAndView;
	}
}
