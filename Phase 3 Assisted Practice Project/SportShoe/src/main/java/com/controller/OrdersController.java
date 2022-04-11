package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Orders;
import com.model.Product;
import com.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@RequestMapping(value="/ordersmgmt", method=RequestMethod.GET)
	public String ordersManagement()
	{
		return "ordersmanagement";
	}
	
	//Add Order
		@RequestMapping(value="/showaddorders", method=RequestMethod.GET)
		public ModelAndView showAddOrders()
		{
			return new ModelAndView("addorders", "orders", new Orders());
		}
		
		@RequestMapping(value="/addorders", method=RequestMethod.POST)
		public String addOrders(@ModelAttribute("orders") Orders orders, Model model)
		{
			ordersService.addOrders(orders);
			model.addAttribute("success", "success");
			return "addorders";
		}
	
		//Find By Id
		@RequestMapping(value="/showfindbyidorders", method=RequestMethod.GET)
		public ModelAndView showFindByIdOrders()
		{
			return new ModelAndView("findbyidorders", "orders", new Orders());
		}
		
		@RequestMapping(value="/findbyidorders", method=RequestMethod.POST)
		public String findByIdProduct(@ModelAttribute("orders") Orders orders, Model model)
		{
			Orders ordersdb = ordersService.findById(orders.getId());
			if(ordersdb == null)
			{
				model.addAttribute("failure", "failure");
			}
			else
			{
				model.addAttribute("ordersdb", ordersdb);
			}
			return "findbyidorders";
		}	
		
		//Find By Date
		@RequestMapping(value="/showfindbydateorders", method=RequestMethod.GET)
		public ModelAndView showFindByDateOrders()
		{
			return new ModelAndView("findbydateorders", "orders", new Orders());
		}
		
		@RequestMapping(value="/findbydateorders", method=RequestMethod.POST)
		public String findByDateOrders(@ModelAttribute("orders") Orders orders, Model model)
		{
			List<Orders> ordersdb = ordersService.findByOrderPurchaseDate(orders.getOrderPurchaseDate());
			
			if(ordersdb.isEmpty())
			{
				model.addAttribute("failure", "failure");
			}
			else
			{
				model.addAttribute("ordersdb", ordersdb);
			}
			return "findbydateorders";
		}
	
		//Find All Product
		@RequestMapping(value="/getallorders")
		public String findAllOrders(Model model)
		{
			List<Orders> orders = ordersService.findAllOrders();
			model.addAttribute("orders", orders);
			return "allorders";
		}
}
