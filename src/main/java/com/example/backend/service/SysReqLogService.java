package com.example.backend.service;

import com.example.backend.SysReqLog;
import com.baomidou.mybatisplus.extension.service.IService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author RiceMarch
 * @description 针对表【sys_req_log(系统日志记录表（不要改名哦！）)】的数据库操作Service
 * @createDate 2022-02-19 22:52:32
 */
public interface SysReqLogService extends IService<SysReqLog> {
    void saveAsync(ProceedingJoinPoint pjp, ServletRequestAttributes sra, long time, Object proceed);
}
