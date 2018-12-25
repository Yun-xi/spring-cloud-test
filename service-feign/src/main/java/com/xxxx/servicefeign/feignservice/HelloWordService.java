package com.xxxx.servicefeign.feignservice;

import com.xxxx.servicefeign.feignservice.impl.HelloWorldServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xieyaqi
 * @mail 987159036@qq.com
 * @date 2018-12-25 09:45
 */
@FeignClient(value = "CONFIG-CLIENT", fallback = HelloWorldServiceImpl.class)
public interface HelloWordService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String  sayHello();
}
