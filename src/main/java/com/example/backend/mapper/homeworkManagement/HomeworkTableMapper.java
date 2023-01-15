package com.example.backend.mapper.homeworkManagement;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.backend.dao.homeworkManagement.HomeworkTable;
import com.example.backend.dao.homeworkManagement.StudentHomeworkAll;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 * @description 针对表【homework_table】的数据库操作Mapper
 * @createDate 2022-02-27 12:49:27
 * @Entity com.wei.test.dao.HomeworkTable
 */
@Mapper
@Repository
public interface HomeworkTableMapper extends BaseMapper<HomeworkTable> {
    IPage<StudentHomeworkAll> getAllStuHomework(IPage<StudentHomeworkAll> iPage, Integer stuID);

    StudentHomeworkAll getStuHomework(Integer stuID, Integer homeworkID);

    IPage<HomeworkTable> getAllInviExam(IPage<HomeworkTable> iPage, Integer teaID);

    IPage<HomeworkTable> getAllPubExam(IPage<HomeworkTable> iPage, Integer teaID);

    IPage<HomeworkTable> getAllReadExam(IPage<HomeworkTable> iPage, Integer teaID);

    String getExamNameByID(Integer examID);
}




