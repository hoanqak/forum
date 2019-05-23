package com.forum.dao;

import com.forum.entity.Profile;

public interface ProfileDAO {

	public void insert(Profile profile);
	public void delete(Profile profile);
	public void update(Profile profile);
	public Profile getProfile(int id);
}
