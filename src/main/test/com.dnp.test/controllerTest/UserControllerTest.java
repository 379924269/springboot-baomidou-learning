package com.dnp.test.controllerTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dnp.test.base.Base;
import com.dnp.test.modular.controller.UserController;
import com.dnp.test.modular.entity.User;
import com.dnp.test.modular.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Map;

/**
 * Created by huazai on 2018/12/4.
 */

public class UserControllerTest extends Base {


    private static final String FIND_BY_ID = "/user/1";
    private static final String FIND_ALL = "/user";

    @Test
    public void findById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get(FIND_BY_ID)   //请求接口
                .contentType(MediaType.APPLICATION_JSON)   //请求contentType
                .accept(MediaType.APPLICATION_JSON))        //接收类型
                .andExpect(MockMvcResultMatchers.status().isOk())   //期望返回结果
                .andDo(MockMvcResultHandlers.print())  //
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void findAll() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get(FIND_ALL)   //请求接口
                .param("page")
                .contentType(MediaType.APPLICATION_JSON)   //请求contentType
                .accept(MediaType.APPLICATION_JSON))        //接收类型
                .andExpect(MockMvcResultMatchers.status().isOk())   //期望返回结果
                .andDo(MockMvcResultHandlers.print())  //
                .andReturn().getResponse().getContentAsString();
    }

}
