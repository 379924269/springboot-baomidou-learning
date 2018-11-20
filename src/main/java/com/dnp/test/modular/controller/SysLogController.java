package com.dnp.test.modular.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.dnp.test.modular.entity.SysLog;
import com.dnp.test.modular.service.SysLogService;
import com.dnp.test.vo.PageVo;

import java.time.LocalDateTime;
                                                
/**
 * <p>
 * 系统日志  前端控制器
 * </p>
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "SysLogController", description = "系统日志")
@RestController
@RequestMapping(value = "/sysLog", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysLogController {
@Autowired private SysLogService sysLogService;

@RequestMapping(value = "", method = RequestMethod.GET)
@ApiOperation(value = "查询所有系统日志", notes = "查询所有系统日志")
public Object findAll(PageVo pageVo,
@ApiParam(name = "search", value = "模糊查询字段", required = false) @RequestParam(required = false, defaultValue = "") String search){
        return null;
        }


@RequestMapping(value = "/{id}", method = RequestMethod.GET)
@ApiOperation(value = "查询系统日志详情", notes = "查询系统日志详情", httpMethod = "GET" )
public SysLog findById(@ApiParam(name = "id", value = "系统日志id", required = true) @PathVariable("id") Integer id){
        return sysLogService.getById(id);
        }

@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
@ApiOperation(value = "修改系统日志", notes = "修改系统日志")
public void updateById(SysLog sysLog){
    sysLogService.saveOrUpdate(sysLog);
        }

@RequestMapping(value = "", method = RequestMethod.POST)
@ApiOperation(value = "添加系统日志", notes = "添加系统日志")
public void save(

             @ApiParam(name = "loginName", value = "登陆名")
    @RequestParam(required = false, name = "loginName" ) String loginName
                        ,
                 @ApiParam(name = "roleName", value = "角色名")
    @RequestParam(required = false, name = "roleName" ) String roleName
                        ,
                 @ApiParam(name = "optContent", value = "内容")
    @RequestParam(required = false, name = "optContent" ) String optContent
                        ,
                 @ApiParam(name = "clientIp", value = "客户端ip")
    @RequestParam(required = false, name = "clientIp" ) String clientIp
                        ,
                 @ApiParam(name = "createTime", value = "创建时间")
    @RequestParam(required = false, name = "createTime" ) LocalDateTime createTime
                    ){
SysLog sysLog =new SysLog(

        loginName,    roleName,    optContent,    clientIp,    createTime        );
sysLogService.save(sysLog);
        }

@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
@ApiOperation(value = "删除系统日志", notes = "修改系统日志")
public void deleteById(@ApiParam(name = "id", value = "系统日志id", required = true) @PathVariable("id") Integer id){
    sysLogService.removeById(id);
        }

        }
