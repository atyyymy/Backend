package com.example.backend.service.impl.homeworkManagement;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backend.dao.homeworkManagement.HomeworkTable;
import com.example.backend.mapper.homeworkManagement.HomeworkTableMapper;
import com.example.backend.service.homeworkManagement.HomeworkTableService;
//import com.wei.test.dao.ReadExamTable;
import com.example.backend.dao.homeworkManagement.StudentHomeworkAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Lenovo
 * @description 针对表【homework_table】的数据库操作Service实现
 * @createDate 2022-02-27 12:49:27
 */
@Service
public class HomeworkTableServiceImpl extends ServiceImpl<HomeworkTableMapper, HomeworkTable>
        implements HomeworkTableService {
    @Autowired
    private HomeworkTableMapper emtm;
//    @Autowired
//    private PaperMetaTableMapper pmtm;

//    @Autowired
//    private ReadExamTableMapper retm;

    // 下三个函数的公共方法
//    public JSONObject getAdminExamList(Long pn, Long size, String status) {
//        QueryWrapper<HomeworkTable> wrapper = new QueryWrapper<>();
//        wrapper.eq("status", status);
//        Page<HomeworkTable> page = new Page<>(pn, size);
//        page.addOrder(OrderItem.desc("ID"));
//        Page<HomeworkTable> userPage = emtm.selectPage(page, wrapper);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("tableData", userPage.getRecords());
//        jsonObject.put("total", userPage.getTotal());
//        return jsonObject;
//    }

//    // 获取管理员视角未开始考试
//    @Override
//    public JSONObject getNotSta(Long pn, Long size) {
//        return getAdminExamList(pn, size, "未开始");
//    }
//
//    // 获取管理员视角进行中考试
//    @Override
//    public JSONObject getInPro(Long pn, Long size) {
//        return getAdminExamList(pn, size, "进行中");
//    }
//
//    // 获取管理员视角已结束考试
//    @Override
//    public JSONObject getOver(Long pn, Long size) {
//        return getAdminExamList(pn, size, "已结束");
//    }
//
//    // 管理员视角删除考试
//    @Override
//    public Boolean delExamByID(Integer examID) {
//        return emtm.deleteById(examID) == 1;
//    }
//
//    // 管理员视角新增考试元信息
//    @Override
//    public Integer addExamMetaInfo(JSONObject obj) {
//        HomeworkTable homeworkTable = new HomeworkTable();
//        homeworkTable.setName(obj.getString("examName"));
//        Date beginTime = obj.getJSONArray("timeRange").getDate(0);
//        homeworkTable.setBeginTime(beginTime);
//        homeworkTable.setEndTime(obj.getJSONArray("timeRange").getDate(1));
//        homeworkTable.setStatus("未开始");
//        examMetaTable.setSwitchDurationLimit(obj.getInteger("switchDurationLimit"));
//        examMetaTable.setTimedEntry(new Date(beginTime.getTime() + obj.getInteger("timedEntry") * 60 * 1000));
//        examMetaTable.setTimedSub(new Date(beginTime.getTime() + obj.getInteger("timedSub") * 60 * 1000));
//        examMetaTable.setAbnormalExitSel(obj.getInteger("abnormalExitSel"));
//        emtm.insert(examMetaTable);
//        // 设置试卷状态为发布
//        UpdateWrapper<PaperMeta> wrapper = new UpdateWrapper<PaperMeta>();
//        wrapper.eq("id", obj.getInteger("paperId"))
//                .set("status", "已发布");
//        pmtm.update(null, wrapper);
//        //为read_exam_table新增数据
//        ReadExamTable readExamTable=new ReadExamTable();
//        readExamTable.setExamId(examMetaTable.getId());
//        readExamTable.setPaperAllNum(0);
//        readExamTable.setPaperReadNum(0);
//        retm.insert(readExamTable);
//
//        return examMetaTable.getId();
//    }

    // 学生视角获取z作业列表
    @Override
    public JSONObject getAllStuHomework(Integer stuID, Long pn, Long size) {
        Page<StudentHomeworkAll> page = new Page<>(pn, size);
        IPage<StudentHomeworkAll> allStuHomework = emtm.getAllStuHomework(page, stuID);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tableData", allStuHomework.getRecords());
        jsonObject.put("total", allStuHomework.getTotal());
        return jsonObject;
    }

    @Override
    public StudentHomeworkAll getStuHomework(Integer stuID, Integer homeworkID) {
        return emtm.getStuHomework(stuID, homeworkID);
    }

//    // 教师视角获取监考列表
//    @Override
//    public JSONObject getAllInviExam(Integer teaID, Long pn, Long size) {
//        Page<ExamMetaTable> page = new Page<>(pn, size);
//        page.addOrder(OrderItem.desc("ID"));
//        IPage<ExamMetaTable> allInviExam = emtm.getAllInviExam(page, teaID);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("tableData", allInviExam.getRecords());
//        jsonObject.put("total", allInviExam.getTotal());
//        return jsonObject;
//    }
//
//    // 教师视角获取发布的试卷列表
//    @Override
//    public JSONObject getAllPubExam(Integer teaID, Long pn, Long size) {
//        Page<ExamMetaTable> page = new Page<>(pn, size);
//        page.addOrder(OrderItem.desc("ID"));
//        IPage<ExamMetaTable> allPubExam = emtm.getAllPubExam(page, teaID);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("tableData", allPubExam.getRecords());
//        jsonObject.put("total", allPubExam.getTotal());
//        return jsonObject;
//    }
//
//    @Override
//    public JSONObject getAllReadExam(Integer teaID, Long pn, Long size) {
//        Page<ExamMetaTable> page = new Page<>(pn, size);
//        page.addOrder(OrderItem.desc("ID"));
//        IPage<ExamMetaTable> allReadExam = emtm.getAllReadExam(page, teaID);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("tableData", allReadExam.getRecords());
//        jsonObject.put("total", allReadExam.getTotal());
//        return jsonObject;
//    }

}




