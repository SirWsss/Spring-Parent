package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName Login
 * @Author Login
 * @Date 2020/5/10 0010 16:08
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserByUserName")
    public User findUserByUserName(){
        return userService.getUser("admin002");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    @GetMapping("/login-error")
    public ModelAndView loginError(HttpServletRequest request, Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登陆失败，账号或者密码错误！");
        return new ModelAndView("login", "userModel", model);
    }

}
