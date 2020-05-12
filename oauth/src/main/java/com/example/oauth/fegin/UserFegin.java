package com.example.oauth.fegin;

import com.example.user.model.User;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName UserFegin
 * @Author wang
 * @Date 2020/5/11 0011 10:26
 */
@FeignClient(value = "USER-CENTER")
public interface UserFegin {

    @PostMapping("/user/getUser")
    User getUser(String username);
}
