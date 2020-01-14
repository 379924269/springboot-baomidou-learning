package com.dnp.test.modular.controller;

import com.dnp.test.modular.entity.RoleResource;
import com.dnp.test.modular.service.RoleResourceService;
import com.dnp.test.vo.PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 角色资源  前端控制器
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "RoleResourceController", description = "角色资源")
@RestController
@RequestMapping(value = "/roleResource", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RoleResourceController {
    @Autowired
    private RoleResourceService roleResourceService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有角色资源", notes = "查询所有角色资源")
    public Object findAll(PageVo pageVo,
                          @ApiParam(name = "search", value = "模糊查询字段", required = false) @RequestParam(required = false, defaultValue = "") String search) {
        return null;
    }

    @RequestMapping(value = "/addUpdateFlagInApplication", method = RequestMethod.GET)
    @ApiOperation(value = "跟新application中的数据")
    public void addUpdateFlagInApplication(HttpServletRequest request) {
        request.getServletContext().setAttribute("updateResourceFlag", true);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查询角色资源详情", notes = "查询角色资源详情", httpMethod = "GET")
    public RoleResource findById(@ApiParam(name = "id", value = "角色资源id", required = true) @PathVariable("id") Integer id) {
        return roleResourceService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改角色资源", notes = "修改角色资源")
    public void updateById(RoleResource roleResource) {
        roleResourceService.saveOrUpdate(roleResource);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "添加角色资源", notes = "添加角色资源")
    public void save(

            @ApiParam(name = "roleId", value = "角色id")
            @RequestParam(required = false, name = "roleId") Long roleId
            ,
            @ApiParam(name = "resourceId", value = "资源id")
            @RequestParam(required = false, name = "resourceId") Long resourceId
    ) {
        RoleResource roleResource = new RoleResource(

                roleId, resourceId);
        roleResourceService.save(roleResource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除角色资源", notes = "修改角色资源")
    public void deleteById(@ApiParam(name = "id", value = "角色资源id", required = true) @PathVariable("id") Integer id) {
        roleResourceService.removeById(id);
    }

}
