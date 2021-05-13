package cn.fyyice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/13 17:06
 */
@SpringBootApplication
@EnableFeignClients
public class ArticleMain {
    public static void main(String[] args) {
        System.out.println("-----博客文章微服务启动成功-----");
        SpringApplication.run(ArticleMain.class, args);
    }
}
