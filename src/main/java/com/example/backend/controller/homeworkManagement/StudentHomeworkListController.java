package com.example.backend.controller.homeworkManagement;

import com.alibaba.fastjson.JSONObject;
import com.example.backend.dao.homeworkManagement.StudentHomeworkAll;
import com.example.backend.service.homeworkManagement.HomeworkTableService;
import com.example.backend.vo.BizBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stuHomeworkList")
public class StudentHomeworkListController {
    @Autowired
    private HomeworkTableService emts;

    @GetMapping("/getStuHomeworkList")
    public BizBaseResponse<JSONObject> getStuHomeworkList(@RequestParam("stuID") Integer stuID,
                                                      @RequestParam("pn") Long pn,
                                                      @RequestParam("size") Long size) {
        return new BizBaseResponse<>(emts.getAllStuHomework(stuID, pn, size));
    }

    @GetMapping("/getStuHomework")
    public BizBaseResponse<StudentHomeworkAll> getStuHomeworkList(@RequestParam("stuID") Integer stuID,
                                                              @RequestParam("homeworkID") Integer homeworkID) {
        return new BizBaseResponse<>(emts.getStuHomework(stuID, homeworkID));
    }
}
