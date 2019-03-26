package com.culinaryrecipes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.dto.AccountDto;
import com.culinaryrecipes.repository.AccountRepository;
import com.culinaryrecipes.service.api.IAccountService;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void deleteById(int id) {
		accountRepository.deleteById(id);
	}

	@Override
	public void deleteByAccount(Account account) {
		accountRepository.delete(account);
	}

	@Override
	public Account createAccount(AccountDto accountDto) {
		Account account = new Account();
		try {
			account.setUsername(accountDto.getUsername());
			account.setEmail(accountDto.getEmail());
			
		}catch(Exception ex) {
			//TODO: Redirect to Error page
		}
		
		return null;
	}

	@Override
	public Account getOne(int id) {
		return accountRepository.getOne(id);
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public List<Account> findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}
	
}