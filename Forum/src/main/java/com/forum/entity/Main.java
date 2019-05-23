package com.forum.entity;

import com.forum.dao.StatusPostDAO;
import com.forum.dao.impl.StatusPostImpl;
import com.sell.hibernateUI.HibernateUI;

public class Main {

	public static void main(String[] args) {
		StatusPost statusPost = new StatusPost("band");
		StatusPostDAO dao = new StatusPostImpl();
		dao.insert(statusPost);
	}

}
