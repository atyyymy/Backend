package com.example.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.SysReqLogTable;

public interface SysReqLogTableService extends IService<SysReqLogTable> {

    PageInfo<SysReqLogTable> page(Integer pageNum, Integer pageSize);
}
