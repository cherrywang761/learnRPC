package com.hong.codec.core;

/**
 * @Description 编码器接口
 * @Author wangweihong
 * @Date 2022/11/9 10:29
 * @Version 1.0
 */
public interface Encoder {

    /**
     * 序列化，将对象序列化成byte数组
     * @param obj 对象
     * @return 序列化后的byte数组
     */
    byte[] encode(Object obj);
}
