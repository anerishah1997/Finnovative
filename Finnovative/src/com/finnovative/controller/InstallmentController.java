package com.finnovative.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.EmiCard;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;
import com.finnovative.service.InstallmentService;
import com.finnovative.service.LoginService;
import com.finnovative.service.ProductTransactionService;

@Controller
public class InstallmentController {

	HttpSession session;

	@Autowired
	InstallmentService installmentService;
	@Autowired
	private LoginService loginService;
	@Autowired
	private EmiCard emicard ;
	@Autowired
	private ModelAndView mav;
	@Autowired
	private ProductTransactionService productTransactionService;


	@RequestMapping(path="pay.do", method=RequestMethod.POST)
	public ModelAndView generateEMIPlan(@RequestParam("calculatedEMI") double installmentAmount, HttpServletRequest request, @RequestParam("noOfMonths") int noOfMonths)
	{
		session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		Product product = (Product) session.getAttribute("product");
		emicard = loginService.fetchEmiCard(user);
		if(emicard.getRemainingCredit()>=installmentAmount)
		{
			int emiNo = installmentService.insertEMIPlan(user, product, installmentAmount, noOfMonths);
			EmiPlan emiplan= installmentService.fetchEMIPlan(emiNo);
			boolean addinstallment = false;
			for(int i=1; i<=emiplan.getNoOfMonths(); i++)
			{
				addinstallment=installmentService.insertInstallment(emiplan,i);
			}
			Boolean result1=installmentService.modifyEmiCard(installmentAmount,user);
			int result2=productTransactionService.addtransaction(product, user);
			if(result1)
			{
				emicard = loginService.fetchEmiCard(user);
				List<ProductTransaction> productTransaction=productTransactionService.fetchTransaction(result2);
				ModelAndView mav=new ModelAndView("dashboard");
				mav.addObject("emicard",emicard);
				mav.addObject("productTransaction", productTransaction);
				return mav;
			}
			else
			{
				mav.setViewName("Error");
				return mav;
			}
		}
		else{
			mav.setViewName("Error2");
			return mav;
		}
	}
	
	@RequestMapping(path="viewInstallments.do")
	public ModelAndView viewInstallment(HttpServletRequest request,@RequestParam("productId")int productId){
		
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		int emino1=installmentService.fetchEmino(user.getUserId(), productId);
		
		List<Installment> installment =  installmentService.fetchInstallment(emino1);
		mav.setViewName("Installments");
		mav.addObject("installments", installment);
		return mav;
		
		
	}
	/*@ExceptionHandler({Exception.class})
	public String handleException(HttpServletRequest request) {
		request.getSession().invalidate();
		return "Error";*/

	


}
