package com.culinaryrecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String defaulpaget() {
		return "pages/public/index";
	}
	
	@GetMapping("/Test")
	public String testpaget() {
		return "Test";
	}
	
	@GetMapping("/index")
	public String index() {

	    return "pages/public/index";
	}

}
