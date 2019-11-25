package com.finnovative.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.EmiCard;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.Users;
import com.finnovative.service.InstallmentService;
import com.finnovative.service.LoginService;

@Controller
public class InstallmentController {
	
	HttpSession session;
	
	@Autowired
	InstallmentService installmentService;
	@Autowired
	private LoginService loginService;
	@Autowired
	EmiCard emicard ;
	
	@RequestMapping(path="pay.do", method=RequestMethod.POST)
	public ModelAndView generaterEMIPlan(@RequestParam("calculatedEMI") double installmentAmount, HttpServletRequest request, @RequestParam("noOfMonths") int noOfMonths)
	{
		session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		Product product = (Product) session.getAttribute("product");
		int result = installmentService.insertEMIPlan(user, product, installmentAmount, noOfMonths);
		EmiPlan emiplan= installmentService.fetchEMIPlan(result);
		boolean addinstallment = false;
		for(int i=1; i<=emiplan.getNoOfMonths(); i++)
		{
		   addinstallment=installmentService.insertInstallment(emiplan,i);
		}
		Boolean result1=installmentService.modifyEmiCard(installmentAmount,user);
		if(result1)
		{
			
			emicard = loginService.fetchEmiCard(user);
			ModelAndView mav=new ModelAndView("dashboard");
			mav.addObject("emicard",emicard);
			return mav;
		}
		else
		{
			ModelAndView mav=new ModelAndView("Error");
		    return mav;
	    }
		
	}

}
