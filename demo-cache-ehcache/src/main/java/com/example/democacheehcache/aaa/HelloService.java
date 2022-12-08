package com.example.democacheehcache.aaa;

public class HelloService {
    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String sayHello(){
        return "我叫"+name+"来自"+address;
    }
}
