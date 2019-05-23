package com.forum.dao;

import java.util.List;

import com.forum.entity.Account;

public interface AccountDAO {

	public void insert(Account account);
	public void delete(Account account);
	public void update(Account account);
	public Account getAccount(int id);
	public Account getAccount(String username);
	public List<Account> getListAccount();
}
