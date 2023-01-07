package com.example.backend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.dao.SysReqLogTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysReqLogTableMapper extends BaseMapper<SysReqLogTable> {
}
