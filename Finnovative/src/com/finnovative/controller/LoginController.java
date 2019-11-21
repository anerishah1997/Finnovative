package com.finnovative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/*@RequestMapping(path="feePaymentPage", method=RequestMethod.GET)
	public String payFeePage()
	{
		
		return "FeePayment";
	}*/
	
	@RequestMapping(path="userlogin.do",method=RequestMethod.POST)
	public String UserLogin(@RequestParam("userLogin")String username, @RequestParam("userPassword")String password, Model model){
		
		
		int result=loginService.checkLogin(username,password);
		
		if(result==1){
			model.addAttribute("username", username);
			return "underverify";
		}
		else
			return "userlogin";
	}

	@RequestMapping(path="payFee.do")
	public String payFee(@RequestParam("userName")String username)
	{
		boolean result = loginService.checkStatus(username);
		if(result)
			return "FeePayment";
		else
			return "Error";
	}
}
