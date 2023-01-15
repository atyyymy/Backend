package com.example.backend.dao.homeworkManagement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentHomeworkAll {
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
