package com.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Regus")
public class HomeController {
	
	
	 
	 
	 
	 
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
    public String login() {
           
		return "login";
    }
	
	@GetMapping("/Access-Denied")
    public String AccessDeny() {
           
		return "Access-Denied";
    }
	

	/*
	 * @RequestMapping("/home") public String getAllEmployees(Model model) {
	 * List<ceo> list = service.getAllEmployees();
	 * 
	 * model.addAttribute("employees", list); return "home"; }
	 */
}
