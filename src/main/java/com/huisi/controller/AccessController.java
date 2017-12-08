package com.huisi.controller;

import com.huisi.model.UserBo;
import com.huisi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhan on 2017/12/5.
 */
@RestController
public class AccessController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public void doLogin() {
        UserBo userBo = new UserBo();
        userBo.setUserName("testName");
        userBo.setPassword("123qwe");
        userService.insertBo_USER(userBo);
    }
}
