package com.culinaryrecipes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.culinaryrecipes.model.Category;
import com.culinaryrecipes.model.dto.CategoryDto;
import com.culinaryrecipes.repository.CategoryRepository;
import com.culinaryrecipes.service.api.ICategoryService;

@Service
public class CategoryService implements ICategoryService 
{
	
	@Autowired
	private CategoryRepository categoryRepository; 
	
	
	@Override
	public void deleteById(int id) 
	{
		categoryRepository.deleteById(id);
	}

	@Override
	public void deleteByCategory(Category category) 
	{
		categoryRepository.delete(category);
	}

	@Override
	public Category createCategory(CategoryDto categoryDto) 
	{
		Category category = new Category();
		try 
		{
			category.setName(categoryDto.getName());
			
		}
		catch(Exception ex) 
		{
		
		}
		
		return null;
	}

	@Override
	public Category getOne(int id) 
	{
		return categoryRepository.getOne(id);
	}

	@Override
	public List<Category> findAll() 
	{
		return categoryRepository.findAll();
	}

	@Override
	public List<Category> findByName(String name) 
	{
		return categoryRepository.findByName(name);
	}
}
