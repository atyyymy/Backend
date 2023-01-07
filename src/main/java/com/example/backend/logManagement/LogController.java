package com.example.backend.logManagement;

import com.github.pagehelper.PageInfo;
import com.example.backend.SysReqLog;
import com.example.backend.dao.SysReqLogTable;
import com.example.backend.service.SysReqLogService;
import com.example.backend.service.SysReqLogTableService;
import com.example.backend.vo.BizBaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wei
 * @create: 2022-03-18 20:59
 * @description: 日志管理
 **/
@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    SysReqLogTableService sysReqLogTableService;

    @GetMapping("/page")
    public BizBaseResponse<PageInfo<SysReqLogTable>> listAuthorityTable(@RequestParam Integer pageSize, @RequestParam Integer pageNum) {
        PageInfo<SysReqLogTable> page = sysReqLogTableService.page(pageNum, pageSize);
        return new BizBaseResponse<>(page);
    }
}
