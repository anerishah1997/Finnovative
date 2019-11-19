package com.finnovative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FinnovativeController {
	
	@RequestMapping(path="/")
	public String homePage(){
		return "index";
	}

	
	
}
