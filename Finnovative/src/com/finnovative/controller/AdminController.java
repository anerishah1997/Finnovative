package com.finnovative.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	@Autowired
	 private SimpleMailMessage message ;
	
	@Autowired
	private MailSender mailsender;
	
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
	public String verifyUser(@RequestParam("userId") int userId, Model model,@RequestParam("email") String email, @RequestParam("username") String username)
	{
		boolean result = adminService.checkUser(userId);
		if(result)
		{
			message.setTo(email);
			message.setSubject("VERIFICATION");
			message.setText("Hello "+username+" your details are verified. You can login to proceed further.");
			mailsender.send(message);
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
	
	 @RequestMapping(path="adminDashboardPage",method=RequestMethod.GET)
	 public String showDashboard(ModelMap model){
		 
		 
		 List<Users> userList = adminService.findAllUsers();
			model.addAttribute("userList", userList);
			return "adminDashboard";
	 }
	 @ExceptionHandler({Exception.class})
		public String handleException() {
			return "Error";
		    
		
	}
	
}
