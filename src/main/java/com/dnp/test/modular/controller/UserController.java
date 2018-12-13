package com.dnp.test.modular.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import com.dnp.test.vo.PageVo;
import com.dnp.test.vo.UserRoleOrgVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
@Validated
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    public Object findAll(@Valid PageVo pageVo,
                          @ApiParam(name = "search", value = "模糊查询字段") @RequestParam(required = false, defaultValue = "") String search) {
        Page<User> page = new Page(pageVo.getOffset(), pageVo.getLimit());
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(search)) {
            queryWrapper.lambda().like(User::getName, search);
        }
        return userService.page(page, queryWrapper);
    }

    @RequestMapping(value = "/findRelation", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户及其相关信息", notes = "获取用户及其相关信息")
    public Object findRelation(PageVo pageVo,
                               @ApiParam(name = "search", value = "模糊查询字段") @RequestParam(required = false, defaultValue = "") String search) {
        Page<UserRoleOrgVo> page = new Page<>(pageVo.getOffset(), pageVo.getLimit());
        return userService.selectUserListPage(page, search);
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
            @Size(max = 20, message = ",字段长度小于20")
            @NotNull(message = "登录名称不能为空")
            @ApiParam(name = "loginName", value = "登陆名")
            @RequestParam(required = false, name = "loginName") String loginName
            ,
//            @Size(max = 20)
//            @NotNull
            @ApiParam(name = "name", value = "用户名")
            @RequestParam(required = false, name = "name") String name
            ,
            @Pattern(regexp = "^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$",
                    message = ":密码长度至少6位，必须包含一个数字字母和特殊字符")
            @ApiParam(name = "password", value = "密码")
            @RequestParam(required = false, name = "password") String password
            ,
//            @Size(max = 2)
//            @NotNull
            @ApiParam(name = "sex", value = "性别")
            @RequestParam(required = false, name = "sex") Integer sex
            ,
//            @Max(100)
//            @NotNull
            @ApiParam(name = "age", value = "年龄")
            @RequestParam(required = false, name = "age") Integer age
            ,
//            @Pattern(regexp = "^1[34578]\\d{9}$")
            @ApiParam(name = "phone", value = "手机号")
            @RequestParam(required = false, name = "phone") String phone
            ,
            @ApiParam(name = "userType", value = "用户类别")
            @RequestParam(required = false, name = "userType") Integer userType
            ,
//            @NotNull
            @ApiParam(name = "organizationId", value = "所属机构")
            @RequestParam(required = false, name = "organizationId") Integer organizationId) {
        User user = new User(loginName, name, password, sex, age, phone, userType, organizationId);
        userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除用户", notes = "修改用户")
    public void deleteById(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
        userService.removeById(id);
    }

}
