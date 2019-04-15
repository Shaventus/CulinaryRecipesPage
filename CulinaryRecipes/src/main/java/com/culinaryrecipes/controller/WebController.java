package com.culinaryrecipes.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/AjaxTest", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    public @ResponseBody String pobierzProdukty(){
        return "Test";
    }

}
