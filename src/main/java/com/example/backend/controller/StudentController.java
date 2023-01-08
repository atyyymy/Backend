package com.example.backend.controller;

import com.example.backend.service.StudentInfoTableService;
import com.example.backend.service.TeacherInfoTableService;
import com.example.backend.vo.BizBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentInfoTableService studentInfoTableService;

    //获取学生登录密码
    @PostMapping("/paperQues/imitateLoginStudent")
    public BizBaseResponse<String> imitateLogin(@RequestParam(value = "phoneNum") String phoneNum) {
        return new BizBaseResponse<>(studentInfoTableService.imitateLogin(phoneNum));
    }
}