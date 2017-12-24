package com.huisi.controller;

import com.huisi.model.UserBo;
import com.huisi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhan on 2017/12/5.
 */
@Controller
public class AccessController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String doLogin(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password
    ) {
        UserBo userBo = new UserBo();
        userBo.setUserName("testName");
        userBo.setPassword("123qwe");
        userService.insertBo_USER(userBo);
        return "index";
    }
}
