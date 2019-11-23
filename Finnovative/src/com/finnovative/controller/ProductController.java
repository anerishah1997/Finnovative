package com.finnovative.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.Part;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.Product;
import com.finnovative.service.ProductServiceImpl;


@Controller

public class ProductController {
@Autowired
private Product product;
@Autowired
private ProductServiceImpl service;

@RequestMapping(path="ProductListPage", method=RequestMethod.GET)
public String viewProduct(Model model){
	List<Product> list = service.findAllProducts();
	System.out.println(list);
	model.addAttribute("productList", list);
	return "productlist";
}
	
@RequestMapping(path="buyProduct.do", method=RequestMethod.GET)
public ModelAndView viewDetailsPage(@RequestParam("productId") int productId,Model model){
	Product product = service.findProductById(productId);
	ModelAndView mav = new ModelAndView("buyProducts");
	mav.addObject("product", product);
	
	return mav;
}
}
/*@RequestMapping(path="viewProducts.do", method=RequestMethod.POST)
public String viewProduct(Model model){
	List<Product> list = service.findAllProducts();
	model.addAttribute("productList", list);
	return "productlist";
}*/


