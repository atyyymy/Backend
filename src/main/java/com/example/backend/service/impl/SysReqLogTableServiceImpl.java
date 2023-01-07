package com.example.backend.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.backend.dao.SysReqLogTable;
import com.example.backend.mapper.SysReqLogTableMapper;
import com.example.backend.service.SysReqLogTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SysReqLogTableServiceImpl extends ServiceImpl<SysReqLogTableMapper, SysReqLogTable>
        implements SysReqLogTableService {

    @Override
    public PageInfo<SysReqLogTable> page(Integer pageNum, Integer pageSize) {
        log.info("分页查询日志");
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<SysReqLogTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        List<SysReqLogTable> list = this.list(queryWrapper);
        PageInfo<SysReqLogTable> pageInfo = new PageInfo<>(list);
        log.info("分页查询日志,resp:{}", JSON.toJSON(pageInfo));
        return pageInfo;
    }
}
