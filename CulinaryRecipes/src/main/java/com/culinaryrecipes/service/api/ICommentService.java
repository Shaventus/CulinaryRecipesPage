package com.culinaryrecipes.service.api;

import com.culinaryrecipes.model.Account;
import com.culinaryrecipes.model.Comment;

public interface ICommentService {
	
	void deleteById(int id);
	
	void deleteByAccount(Account account);
	
	void deleteByComment(Comment comment);

}
