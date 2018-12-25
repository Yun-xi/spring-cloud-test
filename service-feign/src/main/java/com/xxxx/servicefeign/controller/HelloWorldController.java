package com.xxxx.servicefeign.controller;

import com.xxxx.servicefeign.feignservice.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-25 09:49
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWordService helloWordService;

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(){
        return helloWordService.sayHello();
    }
}
