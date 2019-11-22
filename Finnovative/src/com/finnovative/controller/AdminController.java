package com.finnovative.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String AdminLogin(@RequestParam("adminLogin")String username, @RequestParam("adminPassword")String password,Model model){
		
		
		int result=adminService.checkLogin(username,password);
		if(result==1){
			List<Users> userList = adminService.findAllUsers();
			model.addAttribute("userList", userList);
			return "adminDashboard";
		}
		else
			return "adminlogin";
	}
	
	@RequestMapping(path="viewDetails.do", method=RequestMethod.GET)
	public ModelAndView viewDetailsPage(@RequestParam("userId") int userId,Model model){
		Users user = adminService.findUserById(userId);
		ModelAndView mav = new ModelAndView("viewUserDetails");
		mav.addObject("user", user);
		//model.addAttribute("user", user);
		return mav;
	}
	
	@RequestMapping(path="verifyUser.do", method=RequestMethod.GET)
	public String verifyUser(@RequestParam("userId") int userId, Model model)
	{
		boolean result = adminService.checkUser(userId);
		if(result)
		{
			List<Users> userList = adminService.findAllUsers();
			model.addAttribute("userList", userList);
			return "adminDashboard";
		}
		else
			return "Error";
			
	}
	
	
	@RequestMapping(path="rejectUser.do", method=RequestMethod.GET)
	public String rejectUser(@RequestParam("userId") int userId, Model model)
	{
		boolean result = adminService.dismissUser(userId);
		if(result)
		{
			List<Users> userList = adminService.findAllUsers();
			model.addAttribute("userList", userList);
			return "adminDashboard";
		}
		else
			return "Error";
			
	}
	
	
}
