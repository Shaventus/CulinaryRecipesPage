package com.culinaryrecipes.service.api;

import java.util.List;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Recipe;

public interface IRecipeService {

	void deleteById(int id);
	
	void deleteByAccount(Account account);
	
	int getCount();
	
	int getBreakfastCount();
	int getSoupsCount();
	int getMainDishesCount();
	int getDessertsCount();
	
	List<Recipe> findTop3ByOrderByDatetimeDesc();

}
