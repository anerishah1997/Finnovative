package com.finnovative.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public String registerUser(@RequestParam("fullName")String fullname,@RequestParam("PhoneNo")String phoneno,@RequestParam("Email")String email,
			                   @RequestParam("Username")String username,@RequestParam("Password")String password,@RequestParam("Address")String address,
			                   @RequestParam("income")double income,@RequestParam("Card")String cardtype,@RequestParam("Bank")String bank,
			                   @RequestParam("AccountNumber")int accno,@RequestParam("IFSCcode")String ifsc){
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
		user.setAadharDoc(null);
		user.setStatus("PENDING");
		int result = service.addUser(user);
		if(result==1)
			return "userlogin";
		else
			return "register";
	}
	
	
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				//Creating the directory to store file
				//String rootPath = System.getProperty("catalina.home");
				String rootPath = "D:/";
				File dir = new File(rootPath + File.separator + "KYCDocument");
				if (!dir.exists())
					dir.mkdirs();

				String docPath = rootPath+"/KYCDocument/"+name;
				//Create the file on server
				File serverFile = new File(dir.getAbsolutePath()+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				return docPath;
				/*return "You successfully uploaded file=" + name;*/
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name + " because the file was empty.";
		}
	}
	
	
	
	

}
