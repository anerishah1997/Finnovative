package com.finnovative.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.Users;
import com.finnovative.service.InstallmentService;

@Controller
public class InstallmentController {
	
	HttpSession session;
	
	@Autowired
	InstallmentService installmentService;
	
	@RequestMapping(path="pay.do", method=RequestMethod.POST)
	public String generaterEMIPlan(@RequestParam("calculatedEMI") double installmentAmount, HttpServletRequest request, @RequestParam("noOfMonths") int noOfMonths)
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
		if(addinstallment)
			return "dashboard";
		else
			return "Error";
	}

}
