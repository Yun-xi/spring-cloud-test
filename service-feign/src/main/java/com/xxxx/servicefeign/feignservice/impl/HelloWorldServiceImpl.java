package com.xxxx.servicefeign.feignservice.impl;

import com.xxxx.servicefeign.feignservice.HelloWordService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-25 10:43
 */
@Component
public class HelloWorldServiceImpl implements HelloWordService {
    @Override
    public String sayHello() {

        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
