package com.dnp.test.serviceTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dnp.test.base.Base;
import com.dnp.test.base.ControllerBase;
import com.dnp.test.modular.entity.Organization;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import com.dnp.test.vo.UserRoleOrgVo;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;
import java.util.Map;

/**
 * Created by huazai on 2018/12/4.
 */

public class UserServiceTest extends Base {


    @Autowired
    private UserService userService;
    @Test
    public void getMap() {
        Page<UserRoleOrgVo> page = new Page<>(0, 100);
        page.setAsc("u.id");

        List<UserRoleOrgVo> userInfo = userService.selectUserListPage(page, "");
        System.out.println("userInfo = " + userInfo);
    }
}
