package com.forum.api;

import com.forum.dao.impl.AccountImpl;
import com.forum.dao.impl.CommentImpl;
import com.forum.dao.impl.PostImpl;
import com.forum.entity.Account;
import com.forum.entity.Comment;
import com.forum.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class Ajax {
    @Autowired
    AccountImpl accountimpl;
    @Autowired
    CommentImpl commentimpl;
    @Autowired
    PostImpl postimpl;
    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            return "-1";
        } else {
            for (Account account : accountimpl.getListAccount()) {
                if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {

                    session.setAttribute("user", account);
                    return "1";
                }
            }
            return "0";
        }

    }

    @PostMapping("/register")
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.length() <= 5 || password.length() < 8) {
            return "0";
        } else {
            for (Account account : accountimpl.getListAccount()) {
                if (username.equals(account.getUsername())) {
                    return "0";
                }
            }
            accountimpl.insert(new Account(username, password));
            return "1";
        }
    }

    @PostMapping("/check-username")
    public String checkUsername(HttpServletRequest request) {
        String username = request.getParameter("username");
        for (Account account : accountimpl.getListAccount()) {
            if (username.equals(account.getUsername())) {
                return "0";
            }
        }
        return "1";
    }

    @GetMapping("/comment")
    public String comment(HttpServletRequest request) {

        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            return "0";
        } else {
            Account account = (Account) session.getAttribute("user");
            int id = Integer.valueOf(request.getParameter("id"));
            String content = request.getParameter("content");
            String categoryId = request.getParameter("categoryId");
            commentimpl.insert(new Comment(content,account, postimpl.getPost(id) ));
            return "1";
        }
    }

}
