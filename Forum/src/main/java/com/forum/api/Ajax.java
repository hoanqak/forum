package com.forum.api;

import com.forum.dao.impl.AccountImpl;
import com.forum.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        for (Account account : accountimpl.getListAccount()) {
            if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("user", account);
                return "1";
            }
        }
        return "0";
    }
}
