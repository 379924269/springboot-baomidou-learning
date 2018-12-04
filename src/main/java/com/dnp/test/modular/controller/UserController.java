package com.dnp.test.modular.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import com.dnp.test.vo.PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "UserController", description = "用户")
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    public Object findAll(PageVo pageVo,
                          @ApiParam(name = "search", value = "模糊查询字段") @RequestParam(required = false, defaultValue = "") String search) {
        Page<User> page = new Page(pageVo.getOffset(), pageVo.getLimit());
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(search)) {
            queryWrapper.lambda().like(User::getName, search);
        }
        return userService.page(page, queryWrapper);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查询用户详情", notes = "查询用户详情", httpMethod = "GET")
    public User findById(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改用户", notes = "修改用户")
    public void updateById(User user) {
        userService.saveOrUpdate(user);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public void save(

            @ApiParam(name = "loginName", value = "登陆名")
            @RequestParam(required = false, name = "loginName") String loginName
            ,
            @ApiParam(name = "name", value = "用户名")
            @RequestParam(required = false, name = "name") String name
            ,
            @ApiParam(name = "password", value = "密码")
            @RequestParam(required = false, name = "password") String password
            ,
            @ApiParam(name = "salt", value = "密码加密盐")
            @RequestParam(required = false, name = "salt") String salt
            ,
            @ApiParam(name = "sex", value = "性别")
            @RequestParam(required = false, name = "sex") Integer sex
            ,
            @ApiParam(name = "age", value = "年龄")
            @RequestParam(required = false, name = "age") Integer age
            ,
            @ApiParam(name = "phone", value = "手机号")
            @RequestParam(required = false, name = "phone") String phone
            ,
            @ApiParam(name = "userType", value = "用户类别")
            @RequestParam(required = false, name = "userType") Integer userType
            ,
            @ApiParam(name = "status", value = "用户状态")
            @RequestParam(required = false, name = "status") Integer status
            ,
            @ApiParam(name = "organizationId", value = "所属机构")
            @RequestParam(required = false, name = "organizationId") Integer organizationId
            ,
            @ApiParam(name = "createTime", value = "创建时间")
            @RequestParam(required = false, name = "createTime") LocalDateTime createTime
    ) {
        User user = new User(

                loginName, name, password, salt, sex, age, phone, userType, status, organizationId, createTime);
        userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除用户", notes = "修改用户")
    public void deleteById(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
        userService.removeById(id);
    }

}
