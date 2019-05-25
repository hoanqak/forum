package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.forum.dao.ProfileDAO;
import com.forum.entity.Profile;
import com.sell.hibernateUI.HibernateUI;

public class ProfileImpl implements ProfileDAO {

	public void insert(Profile profile) {
		Session session = HibernateUI.getSession();
		try {
			session.save(profile);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public void delete(Profile profile) {
		Session session = HibernateUI.getSession();
		try {
			session.delete(profile);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public void update(Profile profile) {
		Session session = HibernateUI.getSession();
		try {
			session.update(profile);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.beginTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public Profile getProfile(int id) {
		Profile profile = null;
		Session session = HibernateUI.getSession();
		profile = session.get(Profile.class, id);
		session.close();
		return profile;
	}

	public List<Profile> getListProfile() {
		Session session = HibernateUI.getSession();
		@SuppressWarnings("unchecked")
		List<Profile> listProfiles = session.createQuery("From " + Profile.class.getName()).getResultList();
		session.close();
		return listProfiles;
	}

}
