package com.example.backend.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.LoginTable;
import com.example.backend.dao.StudentInfoTable;
import com.example.backend.dao.TeacherInfoTable;
import com.example.backend.mapper.LoginTableMapper;
import com.example.backend.service.StudentInfoTableService;
import com.example.backend.mapper.StudentInfoTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lenovo
 * @description 针对表【student_info_table】的数据库操作Service实现
 * @createDate 2022-02-18 14:10:14
 */
@Service
@Slf4j
public class StudentInfoTableServiceImpl extends ServiceImpl<StudentInfoTableMapper, StudentInfoTable>
        implements StudentInfoTableService{
    @Autowired
    private StudentInfoTableMapper sitm;
    @Autowired
    LoginTableMapper loginTableMapper;
    @Override
    public List<StudentInfoTable> getStudentsByClassID(Integer classId) {
        return sitm.getStudentsByClassID(classId);
    }

    @Override
    public PageInfo<StudentInfoTable> page(Integer pageNum, Integer pageSize) {
        log.info("分页查询学生信息");
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<StudentInfoTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("ID");
        List<StudentInfoTable> list = this.list(queryWrapper);
        PageInfo<StudentInfoTable> pageInfo = new PageInfo<>(list);
        log.info("分页查询学生信息,resp:{}", JSON.toJSON(pageInfo));
        return pageInfo;
    }

    @Override
    public StudentInfoTable getStuByLoginID(JSONObject obj){
        Integer loginId = obj.getInteger("loginId");
        QueryWrapper<StudentInfoTable> wrapper = new QueryWrapper<>();
        wrapper.eq("login_id",loginId);
        StudentInfoTable studentInfoTable = sitm.selectOne(wrapper);
        System.out.println(studentInfoTable);
        return studentInfoTable;
    }

    @Override
    public String imitateLogin(String phoneNum) {
        QueryWrapper<LoginTable> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("phonenum", phoneNum);
        List<LoginTable> list=loginTableMapper.selectList(queryWrapper);
        String pass=list.get(0).getPassword();
        log.info(pass);
        return pass;
    }

}

