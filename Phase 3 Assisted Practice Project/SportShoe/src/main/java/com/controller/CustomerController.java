package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Customer;
import com.model.Product;
import com.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	//Customer Signup page
	@RequestMapping("/showsignup")
	public ModelAndView signUP()
	{
		return new ModelAndView("signup", "customer", new Customer());
	}
	
	//Add Customer
	@RequestMapping(value="/addcustomer", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer, Model model)
	{
		customerService.addCustomer(customer);
		model.addAttribute("success", "success");
		return "signup";
	}
	
	//Customer management page
	@RequestMapping(value="/customermgmt", method=RequestMethod.GET)
	public String customerManagement()
	{
		return "customermanagement";
	}
	
	//Find By Id
		@RequestMapping(value="/showfindbyidcustomer", method=RequestMethod.GET)
		public ModelAndView showFindByIdCustomer()
		{
			return new ModelAndView("findbyidcustomer", "customer", new Customer());
		}
		
		@RequestMapping(value="/findbyidcustomer", method=RequestMethod.POST)
		public String findByIdCustomer(@ModelAttribute("customer") Customer customer, Model model)
		{
			Customer customerdb = customerService.findById(customer.getId());
			
			if(customerdb == null)
			{
				model.addAttribute("failure", "failure");
			}
			else
			{
				model.addAttribute("customerdb", customerdb);
			}
			return "findbyidcustomer";
			
		}
		
		//Find By Name
		@RequestMapping(value="/showfindbynamecustomer", method=RequestMethod.GET)
		public ModelAndView showFindByNameCustomer()
		{
			return new ModelAndView("findbynamecustomer", "customer", new Customer());
		}
		
		@RequestMapping(value="/findbynamecustomer", method=RequestMethod.POST)
		public String findByNameCustomer(@ModelAttribute("customer") Customer customer, Model model)
		{
			List<Customer> customerdb = customerService.findByCusname(customer.getCusname());
			
			if(customerdb.isEmpty())
			{
				model.addAttribute("failure", "failure");
			}
			else
			{
				model.addAttribute("customerdb", customerdb);
			}
			return "findbynamecustomer";
		}
		
		//Find All Customer
		@RequestMapping(value="/getallcustomer")
		public String findAllCustomer(Model model)
		{
			List<Customer> customer = customerService.findAllCustomer();
			model.addAttribute("customer", customer);
			return "allcustomer";
		}
}
