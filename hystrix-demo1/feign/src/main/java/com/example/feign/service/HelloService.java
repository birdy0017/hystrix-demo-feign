package com.example.feign.service;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//@FeignClient(value = "service-hi",fallback = HelloServiceFallback.class)
@FeignClient(value = "service-hi",fallbackFactory =
        HelloServiceFallbackFactory.class)
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String
                                      name);//@RequestParam 注解必须写
}
