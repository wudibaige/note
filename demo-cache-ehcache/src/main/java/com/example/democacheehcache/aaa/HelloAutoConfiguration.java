package com.example.democacheehcache.aaa;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration implements InitializingBean {
    private HelloProperties helloProperties;

    public HelloAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        return new HelloService(helloProperties.getName(),helloProperties.getAddress());
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
