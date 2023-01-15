package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @TableName open_answer_table
 * 简答题作答情况表
 */
@TableName(value = "open_answer_table")
@Data
public class OpenAnswerTable implements Serializable {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private Integer questionId;
    private String rightAnswer;
    private String studentAnswer;
    private Integer studentId;
}
