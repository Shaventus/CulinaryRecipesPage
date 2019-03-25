package com.culinaryrecipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culinaryrecipes.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
