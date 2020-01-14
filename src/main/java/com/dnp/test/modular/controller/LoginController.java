package com.dnp.test.modular.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
@Api(value = "LoginController", description = "登录")
@RestController
@Validated
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public String login(@ApiParam(name = "username", value = "用户名")
                        @RequestParam(required = false, name = "username") String username,
                        @ApiParam(name = "password", value = "密码")
                        @RequestParam(required = false, name = "password") String password) {
        return "";
    }
}

