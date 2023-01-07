package com.example.backend.vo;

import com.example.backend.common.BizErrorCode;
import lombok.Data;

/**
 * 用于响应的业务通用返回值
 *
 * @param <T>
 */
@Data
public class BizBaseResponse<T> {

    //    定义相应返回值
    public int code;

    //    定义相应message
    public String message;

    //    返回数据值
    public T data;

    public BizBaseResponse(T data) {
        this(BizErrorCode.SUCCESS.getCode(), BizErrorCode.SUCCESS.getMessage(), data);
    }

    public BizBaseResponse(int code, String message) {
        this(code, message, null);
    }

    public BizBaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
