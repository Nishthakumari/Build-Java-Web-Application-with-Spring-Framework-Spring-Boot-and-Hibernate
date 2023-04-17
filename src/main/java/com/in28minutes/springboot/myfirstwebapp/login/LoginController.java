package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model){

        model.put("name", name);

        return "login";
    }
}
