package com.dnp.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dnp.test.base.Base;
import com.dnp.test.modular.entity.Organization;
import com.dnp.test.modular.service.OrganizationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by huazai on 2018/12/4.
 */

public class BaomidouSqlTest extends Base {

    @Autowired
    private OrganizationService organizationService;

    @Test
    public void getById() {
        Organization organization= organizationService.getById(1);
    }

    @Test
    public void getMap() {
        QueryWrapper<Organization> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Organization::getId, 1);
        Map<String, Object> map = organizationService.getMap(queryWrapper);
        System.out.println("map = " + map);
    }

    @Test
    public void getObj() {
        QueryWrapper<Organization> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Organization::getId, 1);
        Object map = organizationService.getObj(queryWrapper);
        System.out.println("map = " + map);
    }

    @Test
    public void getOne() {
        QueryWrapper<Organization> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Organization::getId, 1);
        Organization map = organizationService.getOne(queryWrapper);
        System.out.println("map = " + map);
    }
}
