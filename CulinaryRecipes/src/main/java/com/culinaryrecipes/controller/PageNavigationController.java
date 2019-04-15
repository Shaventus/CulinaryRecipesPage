package com.culinaryrecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageNavigationController 
{
	/*
	@GetMapping("/signinsignup")
	public String about() 
	{
		return "/public/signinsignup";
	}
	*/
	
	@RequestMapping(value = "/signinsignup", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("loginError", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");
        
        return "pages/public/signinsignup";
    }
	
}
