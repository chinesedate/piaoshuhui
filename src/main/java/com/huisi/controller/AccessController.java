package com.huisi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhan on 2017/12/5.
 */
@RestController
public class AccessController {

    @GetMapping("/login")
    public void doLogin() {
        int a = 0;
    }
}
