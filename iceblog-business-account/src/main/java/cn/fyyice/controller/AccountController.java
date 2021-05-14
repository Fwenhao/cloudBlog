package cn.fyyice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/13 17:31
 */
@RestController
//允许远端代码更改自动刷新
@RefreshScope
@RequestMapping("/account")
public class AccountController {

    @Value("${account.name}")
    private String name;

    @GetMapping("/get")
    public String get(){
        return "hello "+name;
    }

}
