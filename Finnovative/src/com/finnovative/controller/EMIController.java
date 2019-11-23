package com.finnovative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EMIController {
	
	@RequestMapping(path="calculateEMI.do")
	public ModelAndView calculateEMI(@RequestParam("noOfMonths")int noOfMonths, @RequestParam("prodPrice")double price)
	{
		double emi = noOfMonths/price;
		ModelAndView mav = new ModelAndView("buyProducts");
		mav.addObject("calculatedEMI", emi);
		return mav;
	}

}
