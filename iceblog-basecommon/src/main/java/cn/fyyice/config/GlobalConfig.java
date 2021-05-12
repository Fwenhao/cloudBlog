package cn.fyyice.config;

import cn.fyyice.config.interceptor.CrossOriginHandlerInterceptor;
import cn.fyyice.config.interceptor.ExceptionHandlerInterceptor;
import cn.fyyice.config.interceptor.LogDateHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/12 14:58
 */
@Configuration
@EnableWebMvc
public class GlobalConfig implements WebMvcConfigurer {

    private final LogDateHandlerInterceptor logDateHandlerInterceptor;
    private final CrossOriginHandlerInterceptor crossOriginHandlerInterceptor;

    @Autowired
    public GlobalConfig(LogDateHandlerInterceptor logDateHandlerInterceptor, CrossOriginHandlerInterceptor crossOriginHandlerInterceptor) {
        this.logDateHandlerInterceptor = logDateHandlerInterceptor;
        this.crossOriginHandlerInterceptor = crossOriginHandlerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(crossOriginHandlerInterceptor).addPathPatterns("/**");
        registry.addInterceptor(logDateHandlerInterceptor).addPathPatterns("/**");
    }
}
