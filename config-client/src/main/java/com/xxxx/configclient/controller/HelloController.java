package com.xxxx.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-24 15:26
 */
@RefreshScope
@RestController
public class HelloController {
    @Value("${helloworld}")
    private String hello;

    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }

}
