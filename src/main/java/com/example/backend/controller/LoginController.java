package com.example.backend.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.backend.dao.LoginTable;
import com.example.backend.service.LoginService;
import com.example.backend.vo.BizBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping ("/")
    public BizBaseResponse<LoginTable> Login(@RequestBody JSONObject obj){
        LoginTable loginTable = loginService.login(obj);
//        if (loginTable == null){
//            return BizBaseResponse<>(loginTable);
//        }
        return new BizBaseResponse<>(loginTable);
    }

}
