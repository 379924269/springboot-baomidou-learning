package com.dnp.test.modular.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "请登录";
    }
    @RequestMapping("/login/success")
    public String loginSuccess(){
        User o = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return String.format("用户 -%s-登录成功", o.getUsername());
    }

}
