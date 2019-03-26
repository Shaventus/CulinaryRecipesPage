package com.culinaryrecipes.service.api;

import java.util.List;
import com.culinaryrecipes.model.Category;
import com.culinaryrecipes.model.dto.CategoryDto;

public interface ICategoryService 
{
	void deleteById(int id); 
	void deleteByCategory(Category category);
	Category createCategory(CategoryDto categoryDto);
	Category getOne(int id);
	List<Category> findAll();
	List<Category> findByName(String name);
}
