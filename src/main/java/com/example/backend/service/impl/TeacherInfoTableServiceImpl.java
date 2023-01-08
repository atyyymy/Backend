package com.example.backend.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.LoginTable;
import com.example.backend.dao.TeacherInfoTable;
import com.example.backend.mapper.LoginTableMapper;
import com.example.backend.service.TeacherInfoTableService;
import com.example.backend.mapper.TeacherInfoTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lenovo
 * @description 针对表【teacher_info_table】的数据库操作Service实现
 * @createDate 2022-02-18 14:10:20
 */
@Service
@Slf4j
public class TeacherInfoTableServiceImpl extends ServiceImpl<TeacherInfoTableMapper, TeacherInfoTable>
        implements TeacherInfoTableService{
    @Autowired
    private TeacherInfoTableMapper titm;
    @Autowired
    LoginTableMapper loginTableMapper;

    @Override
    public List<TeacherInfoTable> getAllTeacher() {
        return titm.selectList(null);
    }

    @Override
    public List<TeacherInfoTable> getTeachersByClassID(Integer classId) {
        return titm.getTeachersByClassID(classId);
    }

    @Override
    public PageInfo<TeacherInfoTable> page(Integer pageNum, Integer pageSize) {
        log.info("分页查询教师信息");
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<TeacherInfoTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("ID");
        List<TeacherInfoTable> list = this.list(queryWrapper);
        PageInfo<TeacherInfoTable> pageInfo = new PageInfo<>(list);
        log.info("分页查询教师信息,resp:{}", JSON.toJSON(pageInfo));
        return pageInfo;
    }

    @Override
    public TeacherInfoTable getTeaByLoginID(JSONObject obj){
        Integer loginId = obj.getInteger("loginId");
        QueryWrapper<TeacherInfoTable> wrapper = new QueryWrapper<>();
        wrapper.eq("login_id",loginId);
        TeacherInfoTable teacherInfoTable = titm.selectOne(wrapper);
        System.out.println(teacherInfoTable);
        return teacherInfoTable;
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

