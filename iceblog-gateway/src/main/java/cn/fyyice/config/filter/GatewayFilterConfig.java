package cn.fyyice.config.filter;

import cn.fyyice.config.exception.SystemException;
import cn.fyyice.constant.Tips;
import cn.fyyice.utils.JwtUtils;
import cn.fyyice.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @description: 网关全局过滤
 * @author: fwh
 * @time: 2021/5/14 17:19
 *
 * @Order(0) 表示执行顺序，顺序排布
 */
@Order(0)
@Configuration
public class GatewayFilterConfig implements GlobalFilter {

    private final JwtUtils jwtUtils;
    private final RedisUtils redisUtils;

    public GatewayFilterConfig(JwtUtils jwtUtils, RedisUtils redisUtils) {
        this.jwtUtils = jwtUtils;
        this.redisUtils = redisUtils;
    }

    /**
     * 类似JavaWeb中的 doFilter
     * exchange 封装了request,response
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        List<String> token = exchange.getRequest().getHeaders().get(Tips.TOKEN);
        if (token != null) {
            String accessToken = token.get(0);
            if (redisUtils.get(accessToken) != null){
                jwtUtils.verify(accessToken);
            }else {
                throw new SystemException("用户认证过期");
            }
        }

        //放行
        return chain.filter(exchange);
    }

}
