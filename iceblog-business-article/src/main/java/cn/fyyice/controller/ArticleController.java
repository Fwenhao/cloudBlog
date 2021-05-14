package cn.fyyice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/14 16:28
 */
@RestController
@RefreshScope
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/get")
    public String get(){
        return "hello article controller";
    }


}
