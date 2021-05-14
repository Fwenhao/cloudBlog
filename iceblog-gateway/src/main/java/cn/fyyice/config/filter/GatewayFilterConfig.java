package cn.fyyice.config.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description: 网关全局过滤
 * @author: fwh
 * @time: 2021/5/14 17:19
 *
 * @Order(-1) 表示执行顺序，顺序排布
 */
@Order(-1)
@Configuration
public class GatewayFilterConfig implements GlobalFilter {
    /**
     * 类似JavaWeb中的 doFilter
     * exchange 封装了request,response
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //放行
        return chain.filter(exchange);
    }

}
