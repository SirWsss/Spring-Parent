package com.example.oauth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author wang
 * @Date 2020/5/11 0011 09:04
 * @ps. 测试
 */
@RestController
@RequestMapping("/oauth")
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/demoOne")
    public String getDemo() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        log.info(auth.toString());
        return "Hello world";
    }

}
