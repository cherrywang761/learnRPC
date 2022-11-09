package com.hong.codec.core;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName JSONDecoder
 * @Description TODO类
 * @Author wangweihong
 * @Date 2022/11/9 10:40
 * @Version 1.0
 */
public class JSONDecoder implements Decoder{
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
