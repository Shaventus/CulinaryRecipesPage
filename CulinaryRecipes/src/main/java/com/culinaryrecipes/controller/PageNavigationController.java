package com.culinaryrecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageNavigationController 
{

	@GetMapping("/signinsignup")
	public String about() 
	{
		return "/public/signinsignup.html";
	}
	
}
