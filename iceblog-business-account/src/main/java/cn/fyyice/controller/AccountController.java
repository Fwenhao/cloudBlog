package cn.fyyice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/13 17:31
 */
@RestController
public class AccountController {

    @GetMapping("/get")
    public String get(){
        return "hello";
    }

}
