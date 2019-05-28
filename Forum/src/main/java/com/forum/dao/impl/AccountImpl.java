package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.AccountDAO;
import com.forum.entity.Account;
import com.sell.hibernateUI.HibernateUI;
import org.springframework.stereotype.Repository;

@Repository
public class AccountImpl implements AccountDAO{

	public void insert(Account account) {
		Session session = HibernateUI.getSessionFactory().openSession();
		try {
		session.save(account);
		session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void delete(Account account) {
		Session session = HibernateUI.getSession();
		try {
		session.delete(account);
		session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public void update(Account account) {
		Session session = HibernateUI.getSessionFactory().openSession();
		try {
		session.update(account);
		session.beginTransaction().commit();
		}catch (Exception e) {
			session.beginTransaction().rollback();
		}
		finally {
			session.close();
		}
	}

	public Account getAccount(int id) {
		Session session = HibernateUI.getSession();
		Account account = session.get(Account.class, id);
		session.close();
		return account;
	}

	public Account getAccount(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> getListAccount() {
		Session session = HibernateUI.getSession();
		@SuppressWarnings("unchecked")
		List<Account> list = session.createQuery("From " + Account.class.getName()).getResultList();
		session.close();
		return list;
	}

	public static void main(String[] args) {
		AccountImpl accountimpl = new AccountImpl();
		for (Account account : accountimpl.getListAccount()) {
			System.out.println(account);
		}
	}
}
