package com.xxxx.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-21 17:06
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    String port;

    @GetMapping("/helloword")
    public String home() {
        return "hello world from port " + port;
    }

}
