package com.finnovative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finnovative.model.Users;
import com.finnovative.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private Users user;
	
	
	@RequestMapping(path="userloginPage", method=RequestMethod.GET)
	public String adminLoginPage(){
		return "userlogin";
	}
	
	
	
	@RequestMapping(path="userlogin.do",method=RequestMethod.POST)
	public String UserLogin(@RequestParam("userLogin")String username, @RequestParam("userPassword")String password){
		
		
		int result=loginService.checkLogin(username,password);
		
		if(result==1)
			return "dashboard";
		else
			return "userlogin";
	}

}
