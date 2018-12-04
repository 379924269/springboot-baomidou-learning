package com.dnp.test.controllerTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dnp.test.base.Base;
import com.dnp.test.modular.controller.UserController;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by huazai on 2018/12/4.
 */

public class UserControllerTest extends Base {

    @Autowired
    private UserController userController;

    @Test
    public void getById() {
        userController.findById(1);
    }

}
