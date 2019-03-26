package com.culinaryrecipes.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.culinaryrecipes.model.Like;
import com.culinaryrecipes.model.dto.LikeDto;
import com.culinaryrecipes.repository.LikeRepository;
import com.culinaryrecipes.service.api.ILikeService;

@Service
public class LikeService implements ILikeService
{
	
	@Autowired
	private LikeRepository likeRepository;
	
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
	public Like createLike(LikeDto LlikeDto) 
	{
		Like like = new Like();
		
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
