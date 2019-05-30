package com.culinaryrecipes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.dto.AccountDto;
import com.culinaryrecipes.service.AccountService;
import com.culinarytecipes.model.api.AjaxResponseBody;

@Controller
public class AccountController 
{
	@Autowired
	AccountService accountService;
	
	@GetMapping(value = "/ajax/accountAll")
	public ResponseEntity<?> accountAll(){
		AjaxResponseBody<Account> ajaxResponseBody = new AjaxResponseBody<Account>();
		List<AccountDto> list = new ArrayList<AccountDto>();
		List<Account> accountList = accountService.findAll();
		
		for(Account account : accountList){
			list.add(new AccountDto(account));
		}
		//ajaxResponseBody.setResult(list);
        return ResponseEntity.ok(list);
    }
	
	@RequestMapping("/ajax/admin/search")
	public @ResponseBody List searchPost(@RequestParam("search") String query) {

	    List<Account> result = accountService.findByUsername(query);

	    return result;
	}

}
