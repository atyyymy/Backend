package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @TableName question_table
 * 作业表
 */
@TableName(value = "question_table")
@Data
public class QuestionTable implements Serializable{
    @TableId(type=IdType.AUTO)
    private Integer id;
    private Integer homeworkId;
    private String description;
    private Integer type;
    private Integer score;
}
