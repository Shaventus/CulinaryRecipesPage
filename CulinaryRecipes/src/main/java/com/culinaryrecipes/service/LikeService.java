package com.culinaryrecipes.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Like;
import com.culinaryrecipes.model.Recipe;
import com.culinaryrecipes.model.dto.LikeDto;
import com.culinaryrecipes.repository.AccountRepository;
import com.culinaryrecipes.repository.LikeRepository;
import com.culinaryrecipes.repository.RecipeRepository;
import com.culinaryrecipes.service.api.ILikeService;

@Service
public class LikeService implements ILikeService
{
	
	@Autowired
	private LikeRepository likeRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public void deleteById(int id) 
	{
		likeRepository.deleteById(id);
	}

	@Override
	public void deleteByLike(Like like) 
	{
		likeRepository.delete(like);
	}

	@Override
	public Like createLike(LikeDto LlikeDto, Account account, Recipe recipe) 
	{
		Like like = new Like();
		
		like.setDatetime(new Date());
		like.setAccount(account);
		like.setRecipe(recipe);
		
		likeRepository.save(like);
		
		return like;
	}
	
	@Override
	public Like createLike(LikeDto LlikeDto, int idAccount, int idRecipe) {
		Like like = new Like();
		
		like.setDatetime(new Date());
		like.setAccount(accountRepository.getOne(idAccount));
		like.setRecipe(recipeRepository.getOne(idRecipe));
		likeRepository.save(like);
		
		return null;
	}

	@Override
	public Like getOne(int id) 
	{
		return likeRepository.getOne(id);
	}

	@Override
	public List<Like> findAll() 
	{
		return likeRepository.findAll();
	}

	@Override
	public List<Like> findByDatetime(Date datetime) 
	{
		return likeRepository.findByDatetime(datetime);
	}
	
	
}
