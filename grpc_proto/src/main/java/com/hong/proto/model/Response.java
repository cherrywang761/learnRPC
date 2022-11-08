package com.hong.proto.model;

import lombok.Data;

/**
 * @ClassName Response
 * @Description 表示响应的类
 * @Author wangweihong
 * @Date 2022/11/8 16:41
 * @Version 1.0
 */
@Data
public class Response {
    /**
     * 状态码
     * 成功Consts.SUCCESS_CODE
     * 失败Consts.ERROR_CODE
     */
    private int code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;
}

