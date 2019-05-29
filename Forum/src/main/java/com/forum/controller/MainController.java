package com.forum.controller;

import com.forum.dao.impl.CategoryImpl;
import com.forum.dao.impl.PostImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    CategoryImpl categoryimpl;
    @Autowired
    PostImpl postimpl;
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("category",categoryimpl.getListCategory());
        model.addAttribute("newPost", postimpl.getNewPost());
        return "index";
    }
    @RequestMapping("/post")
    public String post(){
        return "post";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/{id}")
    public String category(@PathVariable("id") String path, Model model){
        int id = Integer.valueOf(path);
        model.addAttribute("category", categoryimpl.getCategory(id));
        return "/show-post-category";
    }
}
