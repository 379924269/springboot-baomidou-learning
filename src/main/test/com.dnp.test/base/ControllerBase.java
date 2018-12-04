package com.dnp.test.base;

import com.dnp.test.BaomidouTestApplication;
import com.dnp.test.modular.entity.User;
import com.dnp.test.vo.PageVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

/**
 * Created by huazai on 2018/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaomidouTestApplication.class)
public class ControllerBase {

    public MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac; // 注入WebApplicationContext

//    @Autowired
//    private MockHttpSession session;// 注入模拟的http session
//
//    @Autowired
//    private MockHttpServletRequest request;// 注入模拟的http request\

    @Before // 在测试开始前初始化工作
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void updateById() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void deleteById() throws Exception {
    }
}
