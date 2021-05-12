package cn.fyyice.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 请求日志拦截器
 * @author: fwh
 * @time: 2021/5/12 11:38
 */

@Component
@Slf4j
public class LogDateHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("{}调用了接口:{},请求地址:{}",
                request.getSession().getAttributeNames()==null?request.getRemoteUser():request.getSession().getAttributeNames(),
                request.getRequestURI(),
                request.getRemoteHost());
        return true;
    }
}
