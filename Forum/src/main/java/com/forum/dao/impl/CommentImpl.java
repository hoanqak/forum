package com.forum.dao.impl;

import java.util.List;

import com.forum.entity.Post;
import org.hibernate.Session;

import com.forum.dao.CommentDAO;
import com.forum.entity.Comment;
import com.sell.hibernateUI.HibernateUI;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CommentImpl implements CommentDAO {

    public void insert(Comment comment) {
        Session session = HibernateUI.getSession();
        try {
            session.save(comment);
            session.beginTransaction().commit();

        } catch (Exception e) {
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void delete(Comment comment) {
        Session session = HibernateUI.getSession();
        try {
            session.delete(comment);
            session.beginTransaction().commit();

        } catch (Exception e) {
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void update(Comment comment) {
        Session session = HibernateUI.getSession();
        try {
            session.update(comment);
            session.beginTransaction().commit();

        } catch (Exception e) {
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public Comment getComment(int id) {
        Comment comment = null;
        Session session = HibernateUI.getSession();
        comment = session.get(Comment.class, id);
        session.close();
        return comment;
    }

    @SuppressWarnings("unchecked")
    public List<Comment> getListComment() {
        List<Comment> list = null;
        Session session = HibernateUI.getSession();
        list = session.createQuery("From com.forum.entity.Comment as c order by c.id asc ").getResultList();
        session.close();
        return list;
    }

}
