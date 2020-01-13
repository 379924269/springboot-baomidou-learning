package com.dnp.test.modular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
@Controller
public class loginController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }
}
