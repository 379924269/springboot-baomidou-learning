package com.dnp.test.modular.controller;

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
    @ApiOperation(value = "threadTest", notes = "修改用户")
    public Object threadTest(@RequestParam("threadName") String threadName) {
        new MyThread(threadName).start();
        return "success";
    }

    @RequestMapping(value = "/threadTest1", method = RequestMethod.GET)
    @ApiOperation(value = "threadTest1", notes = "修改用户")
    public Object threadTest1(@RequestParam("threadName") String threadName) {
        Thread thread = new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("j " + threadName + "= " + j);
            }
        });

        thread.setDaemon(true);
        thread.setPriority(1);
        thread.run();
        return "success";
    }


}
