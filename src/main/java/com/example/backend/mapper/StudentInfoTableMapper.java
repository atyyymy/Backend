package com.example.backend.mapper;

import com.example.backend.dao.StudentInfoTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【student_info_table】的数据库操作Mapper
* @createDate 2022-02-18 14:10:14
* @Entity com.wei.test.dao.StudentInfoTable
*/
@Mapper
@Repository
public interface StudentInfoTableMapper extends BaseMapper<StudentInfoTable> {
    List<StudentInfoTable> getExamStudent(Integer examID);

    List<StudentInfoTable> getStudentsByClassID(Integer classId);
}




