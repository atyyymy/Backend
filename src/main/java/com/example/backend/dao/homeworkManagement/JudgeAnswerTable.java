package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @TableName judge_answer_table
 * 选择题作答情况表
 */
@TableName(value = "judge_answer_table")
@Data
public class JudgeAnswerTable implements Serializable{
    @TableId(type=IdType.AUTO)
    private Integer id;
    private Integer questionId;
    private String rightAnswer;
    private String studentAnswer;
    private Integer studentId;
}
