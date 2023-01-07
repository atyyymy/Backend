package com.example.backend.common;

public enum BizErrorCode {
    //10000系列定义为成功
    SUCCESS(10000, "操作成功"),


    //40000系列参数校验
    PARAMETER_NULL(40000, "数据为空"),
    PARAMETER_ERROR(40001, "参数错误"),

    //50000系列定义为失败
    OPERATION_FAILED(50000, "操作失败");

    private final int code;
    private final String message;

    BizErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
