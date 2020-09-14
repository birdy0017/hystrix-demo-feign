package com.example.feign.service;
import org.springframework.stereotype.Service;
@Service
public class HelloServiceFallback implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return name + ",这里是断路器返回的错误内容";

    }
}