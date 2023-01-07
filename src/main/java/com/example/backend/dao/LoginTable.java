package com.example.backend.dao;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * login_table
 */
@TableName("login_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginTable implements Serializable {


    @TableId
    private Integer id;

    private String phonenum;
    private String password;
    private Integer usertype;
    private String token;

}
