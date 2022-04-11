package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.form.AdminForm;
import com.model.Admin;
import com.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	//Show Admin Portal
	@RequestMapping(value="/adminportal", method=RequestMethod.GET)
	public String adminPortal()
	{	
		return "adminportal";
	}
	
	//Show Login Page
	@RequestMapping(value="/showlogin", method=RequestMethod.GET)
	public ModelAndView showLogin()
	{
		return new ModelAndView("adminlogin", "admin", new Admin());
	}
	
	//Admin Login
	@RequestMapping(value="/adminlogin", method=RequestMethod.POST)
	public String verifyAdminCreds(@ModelAttribute("admin") Admin admin, Model model)
	{
		if(adminService.verifyAdmin(admin)) {
			
			return "adminportal";
		}
		
		model.addAttribute("failure", "failure");
		return "adminlogin";
	}
	
	//Change Password
	@RequestMapping(value="/showchangepassword", method=RequestMethod.GET)
	public ModelAndView showChangePassword()
	{
		return new ModelAndView("changepassword", "adminForm", new AdminForm());
	}
	
	@RequestMapping(value="/updatepassword", method=RequestMethod.POST)
	public ModelAndView updatePassword(@ModelAttribute("adminForm") AdminForm adminForm, Model model)
	{
		Admin admin = new Admin();
		admin.setUsername(adminForm.getUserName());
		admin.setPassword(adminForm.getOldPassword());
		if(adminService.verifyAdmin(admin)) {
			admin.setPassword(adminForm.getNewPassword());
			adminService.updateAdmin(admin.getUsername(), admin);
			return new ModelAndView("adminlogin", "admin", new Admin());
		}
		
		model.addAttribute("failure", "failure");
		return new ModelAndView("changepassword", "adminForm", new AdminForm());
	}
	
	//Logout Admin
	@RequestMapping(value="/logoutadmin", method=RequestMethod.GET)
	public String logoutAdmin(Model model)
	{	
		model.addAttribute("success", "success");
		return "homepage";
	}
}
