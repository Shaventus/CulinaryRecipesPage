package com.culinaryrecipes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culinaryrecipes.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	List<Account> findByUsername(String username);
	
	List<Account> findByUsernameLike(String username);
	
}
