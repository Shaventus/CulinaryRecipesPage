package com.culinaryrecipes.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
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
	public ResponseEntity<?> searchPost(@RequestParam("search") String username) {

		List<AccountDto> list = new ArrayList<AccountDto>();
		List<Account> accountList = accountService.findByUsernameLike(username.concat("%"));
		
		for(Account account : accountList){
			list.add(new AccountDto(account));
		}

        return ResponseEntity.ok(list);
	}
	
	@RequestMapping("/ajax/account/changePassword")
	public ResponseEntity<?> changePassword(@RequestParam("password") String password, @AuthenticationPrincipal UserDetails currentUser) {
		AccountDto accountDto = new AccountDto(accountService.findByUsername(currentUser.getUsername()).get(0));
		accountDto.setPassword(password);
		accountService.updateAccount(accountDto);
		AjaxResponseBody<String> ajaxResponseBody = new AjaxResponseBody<String>();
		List<String> list = new ArrayList<String>();
		list.add("ok");
		ajaxResponseBody.setResult(list);
        return ResponseEntity.ok(ajaxResponseBody);
	}
	
	@RequestMapping("/ajax/accountcount")
	public ResponseEntity<?> accountCount() {

        return ResponseEntity.ok(accountService.getCount());
	}
}
