package com.hong.codec.core;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName JSONEncoder
 * @Description json编码器
 * @Author wangweihong
 * @Date 2022/11/9 10:35
 * @Version 1.0
 */
public class JSONEncoder implements Encoder{
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
