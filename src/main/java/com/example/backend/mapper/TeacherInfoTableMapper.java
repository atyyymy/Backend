package com.example.backend.mapper;

import com.example.backend.dao.TeacherInfoTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【teacher_info_table】的数据库操作Mapper
* @createDate 2022-02-18 14:10:20
* @Entity com.wei.test.dao.TeacherInfoTable
*/
@Mapper
@Repository
public interface TeacherInfoTableMapper extends BaseMapper<TeacherInfoTable> {
    List<TeacherInfoTable> getInvi(Integer examID);
    List<TeacherInfoTable> getReader(Integer examID);
    List<TeacherInfoTable> getTeachersByClassID(Integer classId);
}




