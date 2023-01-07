package com.example.backend.mapper;

import com.example.backend.dao.AdminInfoTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author Lenovo
* @description 针对表【admin_info_table】的数据库操作Mapper
* @createDate 2022-02-18 14:14:51
* @Entity com.wei.test.dao.AdminInfoTable
*/
@Mapper
@Repository
public interface AdminInfoTableMapper extends BaseMapper<AdminInfoTable> {
    Integer getLoginIDByID(Integer id);

    Boolean updateAdminInfo(Integer id, String name, String phone_num,
                            String password, String department, String email);
}




