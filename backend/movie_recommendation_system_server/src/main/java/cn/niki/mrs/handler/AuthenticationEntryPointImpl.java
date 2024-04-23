package cn.niki.mrs.handler;

import cn.niki.mrs.enums.HttpCodeEnum;
import cn.niki.mrs.utils.WebUtils;
import cn.niki.mrs.entity.Result;
import com.alibaba.fastjson.JSON;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        authException.printStackTrace();
        Result result = null;
        if(authException instanceof InternalAuthenticationServiceException || authException instanceof BadCredentialsException){
            result = Result.error(HttpCodeEnum.LOGIN_ERROR.getCode(), HttpCodeEnum.LOGIN_ERROR.getMsg());
        }else if(authException instanceof InsufficientAuthenticationException){
            result = Result.error(HttpCodeEnum.NEED_LOGIN.getCode(), HttpCodeEnum.NEED_LOGIN.getMsg());
        }else{
            result = Result.error(HttpCodeEnum.SYSTEM_ERROR.getCode(), "认证或授权失败");
        }
        String json = JSON.toJSONString(result);
        // 处理异常
        WebUtils.renderString(response, json);
    }
}
