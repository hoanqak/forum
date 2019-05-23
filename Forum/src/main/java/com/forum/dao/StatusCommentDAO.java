package com.forum.dao;

import com.forum.entity.StatusComment;

public interface StatusCommentDAO {
	public void insert(StatusComment statusComment);

	public void delete(StatusComment statusComment);

	public void update(StatusComment statusComment);

	public StatusComment getStatusComment(int id);
}