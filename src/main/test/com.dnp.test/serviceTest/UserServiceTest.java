package com.dnp.test.serviceTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dnp.test.base.Base;
import com.dnp.test.modular.service.UserService;
import com.dnp.test.vo.UserRoleOrgVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
