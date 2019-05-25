package com.forum.dao;

import java.util.List;

import com.forum.entity.Comment;

public interface CommentDAO {
	public void insert(Comment comment);

	public void delete(Comment comment);

	public void update(Comment comment);

	public Comment getComment(int id);
	
	List<Comment> getListComment();
}
