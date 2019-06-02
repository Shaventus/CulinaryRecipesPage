package com.culinaryrecipes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culinaryrecipes.model.Category;
import com.culinaryrecipes.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
	
	long countByCategory(Category category);
	
	List<Recipe> findTop3ByOrderByDatetimeDesc();

}
