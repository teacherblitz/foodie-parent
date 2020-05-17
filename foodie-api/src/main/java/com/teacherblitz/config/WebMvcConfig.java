package com.teacherblitz.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Web 资源配置
 * @author teacherblitz
 * @since 2020/5/17
 */
@Configuration
public class WebMvcConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
