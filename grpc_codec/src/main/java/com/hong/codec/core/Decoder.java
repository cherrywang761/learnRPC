package com.hong.codec.core;

/**
 * @Description 解码器接口
 * @Author wangweihong
 * @Date 2022/11/9 10:29
 * @Version 1.0
 */
public interface Decoder {

    /**
     * 反序列化，将字节数组反序列化成对象
     * @param bytes 字节数组
     * @param clazz 类运行时对象
     * @param <T> 对象类型
     * @return 反序列化对象
     */
    <T>T decode(byte[] bytes, Class<T> clazz);
}
