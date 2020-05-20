package com.example.oauth.fegin;

import com.example.user.model.User;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName UserFegin
 * @Author wang
 * @Date 2020/5/11 0011 10:26
 */
@FeignClient(value = "USER-CENTER")
public interface UserFegin {

    @PostMapping(path = "/user/getUser", params = "username")
    User getUser(@RequestParam("username") String username);
}
