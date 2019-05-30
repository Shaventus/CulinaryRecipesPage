package com.culinaryrecipes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.culinarytecipes.model.api.AjaxResponseBody;

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
	
	@GetMapping("/user/index")
	public String userIndex() {

	    return "pages/user/index";
	}
	
	@GetMapping("/admin/index")
	public String adminIndex() {

	    return "pages/admin/index";
	}
	
	@RequestMapping(value = "/ajax/AjaxTest", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	@ResponseBody
	public String pobierzProdukty(){
        return "Test";
    }
	
	@GetMapping(value = "/ajax/AjaxTest2")
	public ResponseEntity<?> ajaxTest2(){
		AjaxResponseBody<String> ajaxResponseBody = new AjaxResponseBody<String>();
		List<String> list = new ArrayList<String>();
		list.add("Test");
		ajaxResponseBody.setResult(list);
        return ResponseEntity.ok("Test");
    }

}
