package com.forum.dao;

import com.forum.entity.LikePost;

public interface LikePostDAO {

	public void insert(LikePost likePost);
	public void delete(LikePost likePost);
	public void update(LikePost likePost);
	public LikePost getLikePost(int id);
	
}
