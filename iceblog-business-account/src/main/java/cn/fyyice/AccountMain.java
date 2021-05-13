package cn.fyyice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/13 16:43
 */
@SpringBootApplication
@EnableFeignClients
public class AccountMain {
    public static void main(String[] args) {
        System.out.println("-----用户管理微服务启动成功-----");
        SpringApplication.run(AccountMain.class, args);
    }
}
