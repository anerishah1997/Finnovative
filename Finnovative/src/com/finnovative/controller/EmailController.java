package com.finnovative.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.service.EmailService;
import com.finnovative.service.UpdatePasswordService;

@Controller

public class EmailController {
	@Autowired
	private UpdatePasswordService service;
	@Autowired
	private MailSender mailsender;
	@Autowired
	private SimpleMailMessage message ;

	@Autowired
	private EmailService emailService;


	@RequestMapping(path="forgotPasswordPage",method=RequestMethod.GET)
	public String forgotPasswordPage()
	{
		return "forgotpassword";

	}
	@RequestMapping(path="forgotpassword.do",method=RequestMethod.GET)
	public ModelAndView forgotPassword(@RequestParam("email")String email,HttpServletRequest request)
	{

		int otp = (int)(Math.random()*9000)+1000;
		request.setAttribute("otp", otp);
		ModelAndView mav=new ModelAndView("forgotpassword");
		mav.addObject("otp", otp);
		mav.addObject("email", email);
		String pass = emailService.check(email);

		message.setTo(email);
		message.setSubject("YOUR ONE TIME PASSWORD");
		message.setText("Hello your OTP is "+otp+".");
		mailsender.send(message);
		return mav;

	}
	@RequestMapping(path="checkOtp.do",method=RequestMethod.GET)
	public ModelAndView checkotp(@RequestParam("OTP")int otp2,@RequestParam("otp") int otp1,HttpServletRequest request, @RequestParam("email") String email)
	{
		ModelAndView mav=new ModelAndView("updatePassword");
		mav.addObject("email", email);

		if(otp1==otp2)
			return mav;
		else
		{
			mav=new ModelAndView("Error");
			return mav;
		}

	}
	@RequestMapping(path="updatePass.do",method=RequestMethod.POST)
	public String updatePass(@RequestParam("pass")String pass,@RequestParam("email") String email,HttpServletRequest request)
	{
		String password=request.getParameter("pass");

		String result=service.modifyPassword(password,email);
		if(result!=null)
			return "userlogin";
		else 
			return "Error";
	}


	@ExceptionHandler({Exception.class})
	public String handleException() {
		return "Error";


	}
}
