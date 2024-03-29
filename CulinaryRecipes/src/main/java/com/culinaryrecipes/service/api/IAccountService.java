package com.culinaryrecipes.service.api;

import java.util.List;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.dto.AccountDto;

public interface IAccountService {
	
	void deleteById(int id); 
	
	void deleteByAccount(Account account);
	
	Account createAccount(AccountDto accountDto);
	
	void changePassword(String password);
	
	Account getOne(int id);
	
	List<Account> findAll();
	
	List<Account> findByUsername(String username);
	
	boolean isAccountExist(String username);
	
	List<Account> findByUsernameLike(String username);
	
	int getCount();

}
