package com.example.java_base.FilterAndInterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzq 2019/8/1 17:42
 * @description
 */
@RestController
public class TestController {
    @GetMapping("/home")
    public String home(){
        System.out.println("======home=====");
        return "myHome";
    }
}
