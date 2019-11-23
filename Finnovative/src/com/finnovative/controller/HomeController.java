package com.finnovative.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.Product;
import com.finnovative.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService prodService;
	
	@RequestMapping(path="/" ,method=RequestMethod.GET)
	public ModelAndView homePage(){
		List<Product> list= prodService.findAllProducts();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("productList", list);
		return mav;
	}

	@RequestMapping(path="indexPage", method=RequestMethod.GET)
	public ModelAndView HomePage(){
		List<Product> list= prodService.findAllProducts();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("productList", list);
		return mav;
	}
	
	
}
