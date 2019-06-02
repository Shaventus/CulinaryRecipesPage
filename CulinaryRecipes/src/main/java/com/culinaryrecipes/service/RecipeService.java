package com.culinaryrecipes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Category;
import com.culinaryrecipes.model.Recipe;
import com.culinaryrecipes.repository.CategoryRepository;
import com.culinaryrecipes.repository.RecipeRepository;
import com.culinaryrecipes.service.api.IRecipeService;

@Service
public class RecipeService implements IRecipeService {

	@Autowired
	RecipeRepository recipeRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		return Math.toIntExact(recipeRepository.count());
	}

	@Override
	public int getBreakfastCount() {
		Category category = categoryRepository.getOne(1);
		return Math.toIntExact(recipeRepository.countByCategory(category));
	}

	@Override
	public int getSoupsCount() {
		Category category = categoryRepository.getOne(2);
		return Math.toIntExact(recipeRepository.countByCategory(category));
	}

	@Override
	public int getMainDishesCount() {
		Category category = categoryRepository.getOne(3);
		return Math.toIntExact(recipeRepository.countByCategory(category));
	}

	@Override
	public int getDessertsCount() {
		Category category = categoryRepository.getOne(4);
		return Math.toIntExact(recipeRepository.countByCategory(category));
	}

	@Override
	public List<Recipe> findTop3ByOrderByDatetimeDesc() {
		return recipeRepository.findTop3ByOrderByDatetimeDesc();
	}

}
