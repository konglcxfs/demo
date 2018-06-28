package com.example.config;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ExampleService.class)
@EnableConfigurationProperties(StringProperties.class)
public class XfsAutoConfigure {

    @Autowired
    private StringProperties properties;


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "xfs.service",value = "enabled",havingValue = "true")
    ExampleService exampleService (){
        return new ExampleService(properties.getTh());
    }

}
