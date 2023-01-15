package com.example.backend.service.homeworkManagement;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.backend.dao.homeworkManagement.HomeworkTable;
import com.example.backend.dao.homeworkManagement.StudentHomeworkAll;

/**
* @author Lenovo
* @description 针对表【homework_table】的数据库操作Service
* @createDate 2023.1.14
*/
public interface HomeworkTableService extends IService<HomeworkTable> {
//    // 管理员考试管理
//    JSONObject getNotSta(Long pn, Long size);
//
//    JSONObject getInPro(Long pn, Long size);
//
//    JSONObject getOver(Long pn, Long size);
//
//    Boolean delExamByID(Integer examID);

    // 教师作业发布
//    Integer addHomeworkMetaInfo(JSONObject obj);

    // 学生作业管理
    JSONObject getAllStuHomework(Integer stuID, Long pn, Long size);

    StudentHomeworkAll getStuHomework(Integer stuID,Integer homeworkID);

    // 教师考试管理
//    JSONObject getAllInviExam(Integer teaID, Long pn, Long size);
//
//    JSONObject getAllPubExam(Integer teaID, Long pn, Long size);
//
//    JSONObject getAllReadExam(Integer teaID, Long pn, Long size);
}
