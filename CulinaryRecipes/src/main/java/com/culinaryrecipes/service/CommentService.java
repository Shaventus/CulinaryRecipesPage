package com.culinaryrecipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Comment;
import com.culinaryrecipes.repository.CommentRepository;
import com.culinaryrecipes.service.api.ICommentService;

@Service
public class CommentService implements ICommentService {
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByComment(Comment comment) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		return  Math.toIntExact(commentRepository.count());
	}

}
