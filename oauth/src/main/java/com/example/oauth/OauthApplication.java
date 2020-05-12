package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
 * import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
 * 被弃用的两个配置注解,EnableDiscoveryClient替代
 *
 * @EnableDiscoveryClient---启用Eureka
 * @EnableFeignClients---启用Fegin
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }

}
