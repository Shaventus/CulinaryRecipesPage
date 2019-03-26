package com.culinaryrecipes.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.culinaryrecipes.model.Like;


public interface LikeRepository extends JpaRepository<Like, Integer> 
{
	List<Like> findByDatetimeName(Date datetime);
	List<Like> findByDatetimeLike(Date datetime);
}
