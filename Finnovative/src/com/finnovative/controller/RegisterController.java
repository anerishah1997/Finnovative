package com.finnovative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finnovative.model.Users;
import com.finnovative.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterService service;
	@Autowired
	Users user;
	
	@RequestMapping(path="registerPage", method=RequestMethod.GET)
	public String registerPage(){
		return "register";
	}
	
	@RequestMapping(path="registerUser.do",  method=RequestMethod.POST)
	public String registerUser(@RequestParam("FullName")String fullname,@RequestParam("PhoneNo")String phoneno,@RequestParam("Email")String email,
			                   @RequestParam("Username")String username,@RequestParam("Password")String password,@RequestParam("Address")String address,
			                   @RequestParam("income")double income,@RequestParam("Card")String cardtype,@RequestParam("Bank")String bank,
			                   @RequestParam("AccountNumber")long accno,@RequestParam("IFSCcode")String ifsc){
		user.setFullName(fullname);
		user.setMobileNumber(phoneno);
		user.setEmailId(email);
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setAnnualIncome(income);
		user.setCardType(cardtype);
		user.setBankName(bank);
		user.setAccountNumber(accno);
		user.setIfscCode(ifsc);
		user.setVerified("no");
		user.setApproved("no");
		user.setAadhaarDoc(null);
		int result = service.addUser(user);
		if(result==1)
			return "underverify";
		else
			return "register";
	}
	

}
