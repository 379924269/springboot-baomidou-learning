package com.dnp.test.serviceTest;

import com.dnp.test.base.ControllerBase;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by huazai on 2018/12/4.
 */

public class UserControllerTest extends ControllerBase {


    @Test
    public void testQ1() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");

        mockMvc.perform(MockMvcRequestBuilders
                .get("/user/1")
                .content(jsonObject.toString())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk()) //判断返回status
                .andDo(MockMvcResultHandlers.print());// 打印请求结果
    }

    @Override
    public void findAll() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("offset", "0");
        jsonObject.put("limit", "20");
        mockMvc.perform(MockMvcRequestBuilders
                .get("/user")
                .content(jsonObject.toString())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk()) //判断返回status
                .andDo(MockMvcResultHandlers.print());// 打印请求结果
    }
}
