package com.example.democacheehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
public class DemoCacheEhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCacheEhcacheApplication.class, args);
    }

}
