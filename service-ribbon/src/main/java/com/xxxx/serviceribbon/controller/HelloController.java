package com.xxxx.serviceribbon.controller;

import com.xxxx.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-24 17:02
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String Hello() {
        return helloService.getHelloContent();
    }
}
