package com.pjqdyd.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [restTemplate的配置类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class RestConfig {

    private final String baseApiUrl = "http://localhost:7900"; //提供者的接口

    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate =new RestTemplateBuilder().rootUri(baseApiUrl).build();
        return restTemplate;
    }

}
