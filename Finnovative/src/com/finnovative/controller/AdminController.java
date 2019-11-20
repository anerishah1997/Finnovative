package com.finnovative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;
import com.finnovative.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private Users user;
	
	
	@RequestMapping(path="adminLoginPage", method=RequestMethod.GET)
	public String adminLoginPage(){
		return "adminlogin";
	}
	
	
	
	@RequestMapping(path="adminlogin.do",method=RequestMethod.POST)
	public String AdminLogin(@RequestParam("adminLogin")String username, @RequestParam("adminPassword")String password){
		
		
		int result=adminService.checkLogin(username,password);
		
		if(result==1)
			return "adminDashboard";
		else
			return "adminlogin";
	}
	
	
}
