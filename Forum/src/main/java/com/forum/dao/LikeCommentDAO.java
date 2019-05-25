package com.forum.dao;

import com.forum.entity.LikeComment;

public interface LikeCommentDAO {

	public void insert(LikeComment likeComment);
	public void delete(LikeComment likeComment);
	public void update(LikeComment likeComment);
	public LikeComment getLikeComment(int id);
}
