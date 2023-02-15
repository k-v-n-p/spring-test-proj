package com.kvnp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home(@RequestParam(value="name", defaultValue="World",
	required=true) String boom,Model model)
	{
		model.addAttribute("name", boom);
		System.out.println("home page");
		return "hello";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcomePage(@RequestParam String userid,
			@RequestParam String password, ModelMap model)
	{
		if(userid.equals("admin") && password.equals("admin")) {
			model.put("userid", userid);
			return "welcome";
		}
		//Model is an interface while ModelMap is a class. ModelAndView is just a container for both a ModelMap and a View object. 
		model.put("error", "Please provide correct userid and password");
		return "login";
	}
	
	
}
