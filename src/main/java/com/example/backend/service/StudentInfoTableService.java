package com.example.backend.service;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.StudentInfoTable;
import com.baomidou.mybatisplus.extension.service.IService;
//import com.wei.test.dao.TeacherInfoTable;

import java.util.List;

/**
 * @author Lenovo
 * @description 针对表【student_info_table】的数据库操作Service
 * @createDate 2022-02-18 14:10:14
 */
public interface StudentInfoTableService extends IService<StudentInfoTable> {
    List<StudentInfoTable> getStudentsByClassID(Integer classId);

    PageInfo<StudentInfoTable> page(Integer pageNum, Integer pageSize);

    StudentInfoTable getStuByLoginID(JSONObject obj);

    String imitateLogin(String phoneNum);

}

