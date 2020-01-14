package com.dnp.test.modular.controller;

import com.dnp.test.constant.tips.ErrorTip;
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
@Api(value = "LoginController", description = "登录API")
@RestController
@Validated
@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口")
    public void login(@ApiParam(name = "username", value = "用户名称", required = true, defaultValue = "admin") @RequestParam String username,
                      @ApiParam(name = "password", value = "密码", required = true, defaultValue = "123456") @RequestParam String password) {
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ApiOperation(value = "未登录接口（或叫登录界面跳转接口）", hidden = true)
    public Object login() {
        return new ErrorTip(500, "未登录");
    }
}

