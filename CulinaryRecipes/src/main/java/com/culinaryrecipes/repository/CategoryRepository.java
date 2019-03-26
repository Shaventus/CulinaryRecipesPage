package com.culinaryrecipes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.culinaryrecipes.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> 
{
	List<Category> findByName(String name);
	List<Category> findByNameLike(String name);
}
