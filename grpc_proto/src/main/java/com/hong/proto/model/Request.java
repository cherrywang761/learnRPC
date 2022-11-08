package com.hong.proto.model;

import lombok.Data;

/**
 * @ClassName Request
 * @Description 请求类
 * @Author wangweihong
 * @Date 2022/11/8 16:29
 * @Version 1.0
 */
@Data
public class Request {
    /**
     * 请求类携带服务信息
     */
    private ServiceDescriptor serviceDescriptor;

    /**
     * 具体参数数据
     */
    private Object[] parameters;
}
