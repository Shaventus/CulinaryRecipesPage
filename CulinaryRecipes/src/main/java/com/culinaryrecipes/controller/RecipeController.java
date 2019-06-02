package com.culinaryrecipes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Recipe;
import com.culinaryrecipes.model.dto.AccountDto;
import com.culinaryrecipes.model.dto.RecipeDto;
import com.culinaryrecipes.service.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@RequestMapping("/ajax/top3RecipesByDatec")
	public ResponseEntity<?> top3RecipesByDatec() {
		List<RecipeDto> list = new ArrayList<RecipeDto>();
		List<Recipe> recipeList = recipeService.findTop3ByOrderByDatetimeDesc();
		
		for(Recipe recipe : recipeList){
			list.add(new RecipeDto(recipe));
		}
        return ResponseEntity.ok(list);
	}
	
	@RequestMapping("/ajax/reciperCount")
	public ResponseEntity<?> recipeCount() {
        return ResponseEntity.ok(recipeService.getCount());
	}
	
	@RequestMapping("/ajax/breakfastCount")
	public ResponseEntity<?> getBreakfastCount() {
        return ResponseEntity.ok(recipeService.getBreakfastCount());
	}
	
	@RequestMapping("/ajax/soupsCount")
	public ResponseEntity<?> getSoupsCount() {
        return ResponseEntity.ok(recipeService.getSoupsCount());
	}
	
	@RequestMapping("/ajax/mainDishesCount")
	public ResponseEntity<?> getMainDishesCount() {
        return ResponseEntity.ok(recipeService.getMainDishesCount());
	}
	
	@RequestMapping("/ajax/dessertsCount")
	public ResponseEntity<?> getDessertsCount() {
        return ResponseEntity.ok(recipeService.getDessertsCount());
	}
	
	@GetMapping("/admin/addRecipe")
	public String addRecipe() 
	{
		return "pages/admin/addRecipe";
	}
	
	

}
