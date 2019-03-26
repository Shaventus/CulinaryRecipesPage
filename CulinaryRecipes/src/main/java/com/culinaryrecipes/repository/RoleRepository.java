package com.culinaryrecipes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.culinaryrecipes.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> 
{
	List<Role> findByName(String name);
	List<Role> findByNameLike(String name);
}
