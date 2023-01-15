package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @TableName homework_table
 * 作业表
 */
@TableName(value = "homework_table")
@Data
public class HomeworkTable implements Serializable {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private String name;
    private Date beginTime;
    private Date endTime;
    private Integer questionTotal;
    private Integer scoreTotal;
    private String status;
    private Integer score;
    private Integer teacherId;
    private Integer studentId;
}
