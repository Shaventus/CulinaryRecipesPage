package com.culinaryrecipes.service.api;

import java.util.Date;
import java.util.List;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Like;
import com.culinaryrecipes.model.Recipe;
import com.culinaryrecipes.model.dto.LikeDto;


public interface ILikeService 
{
	void deleteById(int id); 
	void deleteByLike(Like like);
	Like createLike(LikeDto LlikeDto, Account account, Recipe recipe);
	Like createLike(LikeDto LlikeDto, int idAccount, int idRecipe);
	Like getOne(int id);
	List<Like> findAll();
	List<Like> findByDatetime(Date datetime);
}
