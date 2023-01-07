package com.example.backend.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.example.backend.SysReqLog;
import com.example.backend.service.SysReqLogService;
import com.example.backend.mapper.SysReqLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author RiceMarch
 * @description 针对表【sys_req_log(系统日志记录表（不要改名哦！）)】的数据库操作Service实现
 * @createDate 2022-02-19 22:52:32
 */
@Service
@Slf4j
public class SysReqLogServiceImpl extends ServiceImpl<SysReqLogMapper, SysReqLog>
        implements SysReqLogService {


    @Async("asyncServiceExecutor")
    @Override
    public void saveAsync(ProceedingJoinPoint pjp, ServletRequestAttributes sra, long time, Object proceed) {
        try {
            String logMsg = "请求日志切面:";
            HttpServletRequest request = sra.getRequest();
            StringBuffer urlBuffer = request.getRequestURL();
            String queryString = request.getQueryString();
            String uri = Optional.ofNullable(request.getRequestURI()).orElse("");
            String method = request.getMethod();


            SysReqLog sysReqLog = new SysReqLog();
            sysReqLog.setReqUri(uri);
            sysReqLog.setReqUrl(urlBuffer.append(Optional.ofNullable(queryString).orElse("")).toString());
            sysReqLog.setTime((int) time);
            //set req resp
            if (pjp.getArgs().length != 0) {
                Object[] args = pjp.getArgs();
                Stream<?> stream = ArrayUtils.isEmpty(args) ? Stream.empty() : Arrays.asList(args).stream();
                List<Object> logArgs = stream
                        .filter(arg -> (!(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse)))
                        .collect(Collectors.toList());
                //过滤后序列化无异常
                String req = JSON.toJSONString(logArgs);
                sysReqLog.setReqParams(req);
            }
            sysReqLog.setRespParams(JSON.toJSONString(proceed));

            //set token
//        String token = request.getHeader(MyToken.AUTHORIZATION);
            log.info(logMsg + "sysReqLog:{}", JSON.toJSONString(sysReqLog));
            this.save(sysReqLog);

        } catch (Exception e) {
            log.error("日志记录异常");
        }

    }

}




