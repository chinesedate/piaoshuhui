package com.huisi.controller;

import com.huisi.model.UserBo;
import com.huisi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @PostMapping("/signup")
    public String doSignup(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password
    ) {
        UserBo userBo = new UserBo();
        userBo.setUserName(userName);
        userBo.setPassword(password);
        userService.insertBo_USER(userBo);
        return "content";
    }

    @PostMapping("/login")
    public String doLogin(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password,
            ModelMap modelMap
    ) {
        String psw = userService.selectBo_USER(userName);
        if (psw != null && password.equals(psw)) {
            return "content";
        } else {
            modelMap.addAttribute("message", "登录不成功！");
            return "index";
        }

    }
}
