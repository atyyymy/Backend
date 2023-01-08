package com.example.backend.controller.dataManagement;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.StudentInfoTable;
import com.example.backend.service.StudentInfoTableService;
import com.example.backend.vo.BizBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wei
 * @create: 2022-03-17 21:11
 * @description: 学生数据管理
 **/


@RestController
@RequestMapping("/student")
public class StudentDataController {
    @Autowired
    StudentInfoTableService studentInfoTableService;

    @GetMapping("/page")
    public BizBaseResponse<PageInfo<StudentInfoTable>> listAuthorityTable(@RequestParam Integer pageSize, @RequestParam Integer pageNum) {
        PageInfo<StudentInfoTable> page = studentInfoTableService.page(pageNum, pageSize);

        return new BizBaseResponse<>(page);
    }
    @PostMapping("/getoneinfo")
    public BizBaseResponse<StudentInfoTable> getOneStudentInfo(@RequestBody JSONObject obj ){
        StudentInfoTable studentInfoTable = studentInfoTableService.getStuByLoginID(obj);
        return new BizBaseResponse<>(studentInfoTable);
    }

}

