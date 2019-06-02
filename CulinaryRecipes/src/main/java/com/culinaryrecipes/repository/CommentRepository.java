package com.culinaryrecipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.culinaryrecipes.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
