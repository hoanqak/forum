package com.forum.dao;

import com.forum.entity.Role;

public interface RoleDAO {

	public void insert(Role role);
	public void delete(Role role);
	public void update(Role role);
	public Role getRole(int id);
}
