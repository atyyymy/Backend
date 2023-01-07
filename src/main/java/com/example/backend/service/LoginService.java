package com.example.backend.service;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.backend.dao.LoginTable;

import java.util.List;

public interface LoginService extends IService<LoginTable> {

    LoginTable login(JSONObject obj);
    // 添加管理员时 需要先拿到新增管理员的登录id 所以返回登录id
    Integer addAdminLoginInfo(String phoneNum,String password);
    // 删除login_id对应的记录
    Boolean delAdminLoginInfo(Integer loginId);

}
