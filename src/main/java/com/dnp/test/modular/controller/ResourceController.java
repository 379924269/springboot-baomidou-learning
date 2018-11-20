package com.dnp.test.modular.controller;

import com.dnp.test.modular.entity.Resource;
import com.dnp.test.modular.service.ResourceService;
import com.dnp.test.vo.PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 * 资源  前端控制器
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "ResourceController", description = "资源")
@RestController
@RequestMapping(value = "/resource", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有资源", notes = "查询所有资源")
    public Object findAll(PageVo pageVo,
                          @ApiParam(name = "search", value = "模糊查询字段", required = false) @RequestParam(required = false, defaultValue = "") String search) {
        return null;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "查询资源详情", notes = "查询资源详情", httpMethod = "GET")
    public Resource findById(@ApiParam(name = "id", value = "资源id", required = true) @PathVariable("id") Integer id) {
        return resourceService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改资源", notes = "修改资源")
    public void updateById(Resource resource) {
        resourceService.saveOrUpdate(resource);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "添加资源", notes = "添加资源")
    public void save(

            @ApiParam(name = "name", value = "资源名称")
            @RequestParam(required = false, name = "name") String name
            ,
            @ApiParam(name = "url", value = "资源路径")
            @RequestParam(required = false, name = "url") String url
            ,
            @ApiParam(name = "openMode", value = "打开方式 ajax,iframe")
            @RequestParam(required = false, name = "openMode") String openMode
            ,
            @ApiParam(name = "description", value = "资源介绍")
            @RequestParam(required = false, name = "description") String description
            ,
            @ApiParam(name = "icon", value = "资源图标")
            @RequestParam(required = false, name = "icon") String icon
            ,
            @ApiParam(name = "pid", value = "父级资源id")
            @RequestParam(required = false, name = "pid") Long pid
            ,
            @ApiParam(name = "seq", value = "排序")
            @RequestParam(required = false, name = "seq") Integer seq
            ,
            @ApiParam(name = "status", value = "状态")
            @RequestParam(required = false, name = "status") Integer status
            ,
            @ApiParam(name = "opened", value = "打开状态")
            @RequestParam(required = false, name = "opened") Integer opened
            ,
            @ApiParam(name = "resourceType", value = "资源类别")
            @RequestParam(required = false, name = "resourceType") Integer resourceType
            ,
            @ApiParam(name = "createTime", value = "创建时间")
            @RequestParam(required = false, name = "createTime") LocalDateTime createTime
            ,
            @ApiParam(name = "method", value = "请求方法：get、post......")
            @RequestParam(required = false, name = "method") String method
    ) {
        Resource resource = new Resource(

                name, url, openMode, description, icon, pid, seq, status, opened, resourceType, createTime, method);
        resourceService.save(resource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除资源", notes = "修改资源")
    public void deleteById(@ApiParam(name = "id", value = "资源id", required = true) @PathVariable("id") Integer id) {
        resourceService.removeById(id);
    }

}
