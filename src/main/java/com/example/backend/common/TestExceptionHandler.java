package com.example.backend.common;

import com.example.backend.vo.BizBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
@Slf4j
public class TestExceptionHandler {

    //TODO 统一异常处理
    @ExceptionHandler(value = TestException.class)
    @ResponseBody
    public BizBaseResponse<Void> exceptionHandler(TestException e) {
        return new BizBaseResponse<>(BizErrorCode.PARAMETER_ERROR.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public BizBaseResponse<Void> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        assert fieldError != null;
        log.error(fieldError.getField() + ":" + fieldError.getDefaultMessage());
        return new BizBaseResponse<>(BizErrorCode.PARAMETER_ERROR.getCode(), fieldError.getDefaultMessage());
    }
}