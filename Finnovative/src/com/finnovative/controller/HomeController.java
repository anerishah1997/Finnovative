package com.finnovative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(path="/")
	public String homePage(){
		return "index";
	}

	@RequestMapping(path="indexPage", method=RequestMethod.GET)
	public String adminLoginPage(){
		return "index";
	}
	
	
}
