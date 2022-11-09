package com.hong.transport.client;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description 请求处理类接口,处理网络请求的handler
 * @Author wangweihong
 * @Date 2022/11/9 11:46
 * @Version 1.0
 */
public interface RequestHandler {
    void onRequest(InputStream recive, OutputStream toResp);
}
