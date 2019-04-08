package com.culinaryrecipes.service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Role;
import com.culinaryrecipes.model.dto.AccountDto;
import com.culinaryrecipes.repository.AccountRepository;
import com.culinaryrecipes.repository.RoleRepository;
import com.culinaryrecipes.service.api.IAccountService;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;

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
			account.setPassword(passwordEncoder.encode(accountDto.getPassword()));
			account.setEmail(accountDto.getEmail());
			account.setEnabled((byte)1);
			account.setCreationAccountDate(new Date());
			
			Role role = roleRepository.getOne(1);
			account.setRoles(Arrays.asList(role));
			role.getAccounts().add(account);
			
			accountRepository.save(account);
			
		}catch(Exception ex) {
			//TODO: Redirect to Error page
		}
		
		return account;
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

	@Override
	public boolean isAccountExist(String username) {
		return accountRepository.findByUsername(username) != null;
	}
	
}
