package com.xxxx.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent() {
        return restTemplate.getForObject("http://CONFIG-CLIENT/hello",String.class);
    }

    public String serviceFailure() {
        return "hello world service is not available !";
    }
}
