package com.finnovative.controller;


import java.io.File;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

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
	public String registerUser(@RequestParam("PhoneNo")String phoneno,@RequestParam("fullName")String fullname,@RequestParam("Email")String email,
			@RequestParam("Username")String username,@RequestParam("Password")String password,@RequestParam("Address")String address,
			@RequestParam("income")double income,@RequestParam("Card")String cardtype,@RequestParam("Bank")String bank,
			@RequestParam("AccountNumber")int accno,@RequestParam("IFSCcode")String ifsc,@RequestParam("aadhar") MultipartFile aadharDoc){
		String path="C:/Program Files/Apache Software Foundation/Tomcat 8.0/webapps/KYCDocsUsers/";
		/*String path="D:/KYCDocsUsers/";*/
		String docpath= path+aadharDoc.getOriginalFilename();
		String dbpath= aadharDoc.getOriginalFilename();

		try{
			aadharDoc.transferTo(new File(docpath));

		}
		catch(IOException e)
		{
			System.out.println("failed to upload file"+e);
		}


		user.setFullName(fullname);
		user.setMobileNumber(phoneno);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setAnnualIncome(income);
		user.setCardType(cardtype);
		user.setBankName(bank);
		user.setAccountNumber(accno);
		user.setIfscCode(ifsc);
		user.setAadharDoc(dbpath);
		user.setStatus("PENDING");
		int result = service.addUser(user);
		if(result==1)
			return "userlogin";
		else
			return "register";
	}

	@ExceptionHandler({Exception.class})
	public String handleException() {
		return "Error";

	}
}




