package com.dnp.test.constant.tips;


import com.dnp.test.exception.BizExceptionEnum;

/**
 * 返回给前台的错误提示
 *
 * @author 华仔
 * @date 2017年8月17日10:18:46
 */
public class ErrorTip extends Tip {

    public ErrorTip(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public ErrorTip(BizExceptionEnum bizExceptionEnum) {
        this.code = bizExceptionEnum.getCode();
        this.message = bizExceptionEnum.getMessage();
    }
}
