package com.finnovative.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;
import com.finnovative.service.LoginService;
import com.finnovative.service.ProductService;
import com.finnovative.service.ProductTransactionService;

@Controller
@SessionAttributes({"users"})
public class LoginController {
	HttpSession session; 

	@Autowired
	private LoginService loginService;

	@Autowired
	private ProductService productService;

	@Autowired
	private Users user;

	@Autowired
	private ProductTransactionService productTransactionService;

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
	public ModelAndView UserLogin(@RequestParam("userLogin")String username, @RequestParam("userPassword")String password, ModelMap model, HttpServletRequest request){



		Users user = loginService.checkLogin(username,password);
		model.put("users",user);
		session = request.getSession();
		session.setAttribute("user", user);
		if(user.getStatus().equals("APPROVED"))
		{			
			EmiCard card = loginService.fetchEmiCard(user);
			List<ProductTransaction> list = productTransactionService.fetchTransaction(user.getUserId());
			ModelAndView mav = new ModelAndView("dashboard");
			mav.addObject("emicard", card);
			mav.addObject("productTransaction", list);
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

		if(result){
			String card = loginService.checkCard(user.getUsername());
			if(card.equals("Gold"))
			{
				model.addAttribute("fee", 2000);
				return "FeePayment";
			}
			else{
				model.addAttribute("fee", 4000);
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
		List<Product> list = productService.findAllProducts();

		model.addAttribute("productList", list);
		return "index";

	}

	@RequestMapping(path="viewProduct.do",method=RequestMethod.GET)
	public String checkUserSession(ModelMap model){
		if(model.get("users")==null)		 
			return "userlogin";
		else
			return "productlist";

	}

	@RequestMapping(path="viewDashboardPage",method=RequestMethod.GET)
	public ModelAndView showDashboard(ModelMap model){

		Users user = (Users)model.get("users");
		EmiCard emicard = loginService.fetchEmiCard(user);
		List<ProductTransaction> list = productTransactionService.fetchTransaction(user.getUserId());
		ModelAndView mav= new ModelAndView("dashboard");
		mav.addObject("emicard", emicard);
		mav.addObject("productTransaction", list);
		return mav;
	}
	@ExceptionHandler({Exception.class})
	public String handleException() {
		return "Error";


	}

}
