package com.dnp.test.modular.controller;

import com.dnp.test.modular.entity.UserRole;
import com.dnp.test.modular.service.UserRoleService;
import com.dnp.test.vo.PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户角色  前端控制器
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "UserRoleController", description = "用户角色")
@RestController
@RequestMapping(value = "/userRole", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户角色", notes = "查询所有用户角色")
    public Object findAll(PageVo pageVo,
                          @ApiParam(name = "search", value = "模糊查询字段", required = false) @RequestParam(required = false, defaultValue = "") String search) {
        return null;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查询用户角色详情", notes = "查询用户角色详情", httpMethod = "GET")
    public UserRole findById(@ApiParam(name = "id", value = "用户角色id", required = true) @PathVariable("id") Integer id) {
        return userRoleService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改用户角色", notes = "修改用户角色")
    public void updateById(UserRole userRole) {
        userRoleService.saveOrUpdate(userRole);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "添加用户角色", notes = "添加用户角色")
    public void save(

            @ApiParam(name = "userId", value = "用户id")
            @RequestParam(required = false, name = "userId") Long userId
            ,
            @ApiParam(name = "roleId", value = "角色id")
            @RequestParam(required = false, name = "roleId") Long roleId
    ) {
        UserRole userRole = new UserRole(

                userId, roleId);
        userRoleService.save(userRole);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除用户角色", notes = "修改用户角色")
    public void deleteById(@ApiParam(name = "id", value = "用户角色id", required = true) @PathVariable("id") Integer id) {
        userRoleService.removeById(id);
    }

}
