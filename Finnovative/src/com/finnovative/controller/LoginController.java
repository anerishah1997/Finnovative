 package com.finnovative.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Users;
import com.finnovative.service.LoginService;

@Controller
@SessionAttributes({"users"})
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
	public ModelAndView UserLogin(@RequestParam("userLogin")String username, @RequestParam("userPassword")String password, ModelMap model){
	
		
		
		Users user = loginService.checkLogin(username,password);
		model.put("users",user);
		System.out.println(user.getStatus());
		if(user.getStatus().equals("APPROVED"))
		{			
			EmiCard card = loginService.fetchEmiCard(user);
			ModelAndView mav = new ModelAndView("dashboard");
			mav.addObject("emicard", card);
			return mav;
		}
		else
		{
			ModelAndView mav = new ModelAndView("underverify");
			mav.addObject("user", user);
			return mav;
		}
		
		/*if(user!=null){
			model.put("users", user);
			return "underverify";
		}
		else
			return "userlogin";*/
	}

	@RequestMapping(path="payFee.do")
	public String payFee(ModelMap model)
	{
		Users user = (Users) model.get("users");
		boolean result = loginService.checkStatus(user.getUsername());
		System.out.println(user.getUsername());
		if(result){
			String card = loginService.checkCard(user.getUsername());
			if(card.equals("Gold"))
			{
				model.addAttribute("fee", 1000);
			    return "FeePayment";
			}
			else{
				model.addAttribute("fee", 2000);
				return "FeePayment";
			}
		}
		else
			return "underverify";
	
	}
	
	 @RequestMapping(path="activateUser.do",method=RequestMethod.POST)
	 public ModelAndView activateUser(ModelMap model)
	 {
		 Users user = (Users)model.get("users");
		 
		 int result = loginService.activateUser(user);
		 if(result==1){
			 boolean res = loginService.insertEmiCard(user);
			 EmiCard card = loginService.fetchEmiCard(user);
			 ModelAndView mav = new ModelAndView("dashboard");
			 mav.addObject("emicard", card);
			 return mav;
		 }
		 else{
			 ModelAndView mav = new ModelAndView("Error");
			 return mav;
		 }
	 }
	 @RequestMapping(path="logOut.do",method=RequestMethod.GET)
	 public String invalidateSession(HttpServletRequest request, ModelMap model){
		 request.removeAttribute("users");
		 request.getSession().invalidate();
		 return "index";
		 
	 }
	 
	 @RequestMapping(path="viewProduct.do",method=RequestMethod.GET)
	 public String checkUserSession(ModelMap model){
		 if(model.get("users")==null)		 
			 return "userlogin";
		 else
			 return "productlist";
			 
	 }
}
