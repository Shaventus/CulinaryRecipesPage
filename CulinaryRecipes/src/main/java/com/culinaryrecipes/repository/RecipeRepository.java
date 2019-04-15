package com.culinaryrecipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culinaryrecipes.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
