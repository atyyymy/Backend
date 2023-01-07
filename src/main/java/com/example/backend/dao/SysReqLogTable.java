package com.example.backend.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author: wei
 * @create: 2022-03-18 21:24
 * @description: 日志表
 **/

@Data
@TableName(value ="sys_req_log")
public class SysReqLogTable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer loginId;

    private String operatorName;

    private String operatorType;

    private String reqUrl;

    private String req_uri;

    private Integer time;

    private String method;

    private String reqParams;

    private String respParams;

    private Date createTime;

    private Integer level;
}
