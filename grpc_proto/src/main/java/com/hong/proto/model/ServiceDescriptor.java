package com.hong.proto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ServiceDescriptor
 * @Description 服务描述类（存储该服务的相关信息）
 * @Author wangweihong
 * @Date 2022/11/8 16:20
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDescriptor {
    //类信息
    private String clazz;
    //方法信息
    private String method;
    //返回类型
    private String returnType;
    //参数类型
    private String[] parameterTypes;
}
