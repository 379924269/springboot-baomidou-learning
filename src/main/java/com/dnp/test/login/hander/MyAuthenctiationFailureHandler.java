package com.dnp.test.login.hander;

import com.dnp.test.constant.tips.ErrorTip;
import com.dnp.test.constant.tips.ExceptionConst;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huazai
 * @description 登录失败处理
 * @date 2019/9/12
 */
@Component
public class MyAuthenctiationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(ExceptionConst.AUTHENCITION_FAILURE_EXCEPTION);
        if (exception.getCause() instanceof LockedException) {
            response.getWriter().write(new ErrorTip(ExceptionConst.AUTHENCITION_FAILURE_EXCEPTION, exception.getMessage()).toString());
        } else {
            response.getWriter().write(new ErrorTip(ExceptionConst.AUTHENCITION_FAILURE_EXCEPTION, "用户名或密码错误").toString());
        }
    }
}
