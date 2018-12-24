package com.xxxx.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-24 17:01
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String getHelloContent() {
        return restTemplate.getForObject("http://CONFIG-CLIENT/hello",String.class);
    }
}
