package com.dnp.test.modular.controller;

import com.dnp.test.constant.tips.SuccessTip;
import com.dnp.test.util.MyThread;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@Api(value = "ThreadTestController", description = "线程测试")
@RestController
@Validated
@RequestMapping(value = "/thread", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ThreadTestController {

    @RequestMapping(value = "/threadTest", method = RequestMethod.GET)
    @ApiOperation(value = "threadTest", notes = "单独起一个现场测试")
    public Object threadTest(@RequestParam("threadName") String threadName) {
        new MyThread(threadName).start();
        return new SuccessTip();
    }

    @RequestMapping(value = "/threadTest1", method = RequestMethod.GET)
    @ApiOperation(value = "threadTest1", notes = "直接controller 没处理完 看是否阻塞其他controller")
    public Object threadTest1(@RequestParam("threadName") String threadName) {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("threadName + i = " + threadName + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }


}
