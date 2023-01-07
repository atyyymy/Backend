package com.example.backend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backend.dao.LoginTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface LoginTableMapper extends BaseMapper<LoginTable> {

}
