package com.example.demoactuator;

import com.example.democacheehcache.aaa.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/say")
    public String sayHello( ) {
        return helloService.sayHello();
    }
}
