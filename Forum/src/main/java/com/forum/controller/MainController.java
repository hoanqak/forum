package com.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home(){
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
}
