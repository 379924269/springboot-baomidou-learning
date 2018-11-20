package com.dnp.test.modular.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.dnp.test.modular.entity.Organization;
import com.dnp.test.modular.service.OrganizationService;
import com.dnp.test.vo.PageVo;

import java.time.LocalDateTime;
                                                                
/**
 * <p>
 * 组织机构  前端控制器
 * </p>
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "OrganizationController", description = "组织机构")
@RestController
@RequestMapping(value = "/organization", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrganizationController {
@Autowired private OrganizationService organizationService;

@RequestMapping(value = "", method = RequestMethod.GET)
@ApiOperation(value = "查询所有组织机构", notes = "查询所有组织机构")
public Object findAll(PageVo pageVo,
@ApiParam(name = "search", value = "模糊查询字段", required = false) @RequestParam(required = false, defaultValue = "") String search){
        return null;
        }


@RequestMapping(value = "/{id}", method = RequestMethod.GET)
@ApiOperation(value = "查询组织机构详情", notes = "查询组织机构详情", httpMethod = "GET" )
public Organization findById(@ApiParam(name = "id", value = "组织机构id", required = true) @PathVariable("id") Integer id){
        return organizationService.getById(id);
        }

@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
@ApiOperation(value = "修改组织机构", notes = "修改组织机构")
public void updateById(Organization organization){
    organizationService.saveOrUpdate(organization);
        }

@RequestMapping(value = "", method = RequestMethod.POST)
@ApiOperation(value = "添加组织机构", notes = "添加组织机构")
public void save(

             @ApiParam(name = "name", value = "组织名")
    @RequestParam(required = false, name = "name" ) String name
                        ,
                 @ApiParam(name = "address", value = "地址")
    @RequestParam(required = false, name = "address" ) String address
                        ,
                 @ApiParam(name = "code", value = "编号")
    @RequestParam(required = false, name = "code" ) String code
                        ,
                 @ApiParam(name = "icon", value = "图标")
    @RequestParam(required = false, name = "icon" ) String icon
                        ,
                 @ApiParam(name = "pid", value = "父级主键")
    @RequestParam(required = false, name = "pid" ) Long pid
                        ,
                 @ApiParam(name = "seq", value = "排序")
    @RequestParam(required = false, name = "seq" ) Integer seq
                        ,
                 @ApiParam(name = "createTime", value = "创建时间")
    @RequestParam(required = false, name = "createTime" ) LocalDateTime createTime
                    ){
Organization organization =new Organization(

        name,    address,    code,    icon,    pid,    seq,    createTime        );
organizationService.save(organization);
        }

@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
@ApiOperation(value = "删除组织机构", notes = "修改组织机构")
public void deleteById(@ApiParam(name = "id", value = "组织机构id", required = true) @PathVariable("id") Integer id){
    organizationService.removeById(id);
        }

        }
