package com.example.backend.service;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.TeacherInfoTable;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author Lenovo
 * @description 针对表【teacher_info_table】的数据库操作Service
 * @createDate 2022-02-18 14:10:20
 */
public interface TeacherInfoTableService extends IService<TeacherInfoTable> {
    List<TeacherInfoTable> getAllTeacher();
    List<TeacherInfoTable> getTeachersByClassID(Integer classId);

    PageInfo<TeacherInfoTable> page(Integer pageNum, Integer pageSize);

    TeacherInfoTable getTeaByLoginID(JSONObject obj);

    String imitateLogin(String phoneNum);

}


