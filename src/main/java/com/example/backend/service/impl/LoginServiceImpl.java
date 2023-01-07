package com.example.backend.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backend.dao.LoginTable;
import com.example.backend.mapper.LoginTableMapper;
import com.example.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author: wei
 * @create: 2022-03-13 15:43
 * @description: LoginService
 **/
@Service("LoginService")
public class LoginServiceImpl extends ServiceImpl<LoginTableMapper,LoginTable> implements LoginService {

    @Autowired
    LoginTableMapper loginTableMapper;

    @Override
    public LoginTable login(JSONObject obj){

        String phonenum = obj.getString("phone_num");
        String password = obj.getString("pass_word");
        QueryWrapper<LoginTable> wrapper = new QueryWrapper<>();
        wrapper.eq("phonenum",phonenum).eq("password",password);
        LoginTable loginTable = loginTableMapper.selectOne(wrapper);
        return loginTable;
    }

    @Override
    public Integer addAdminLoginInfo(String phoneNum, String password) {
        LoginTable loginTable = new LoginTable();
        loginTable.setPhonenum(phoneNum);
        loginTable.setPassword(password);
        loginTable.setToken("");
        loginTable.setUsertype(3);
        loginTableMapper.insert(loginTable);
        return loginTable.getId();
    }

    @Override
    public Boolean delAdminLoginInfo(Integer loginId) {
        QueryWrapper<LoginTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",loginId);
        return loginTableMapper.delete(queryWrapper) > 0;
    }

}
