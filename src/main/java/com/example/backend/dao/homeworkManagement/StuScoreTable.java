package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @TableName stu_answer_table
 * 得分情况表
 */
@TableName(value = "stu_score_table")
@Data
public class StuScoreTable implements Serializable{
    @TableId(type=IdType.AUTO)
    private Integer id;
    private Integer homeworkId;
    private Integer teacherId;
    private Integer studentId;
    private String teacherNote;
    private Integer finalScore;
}
