package com.hong.transport.client;

import com.hong.proto.model.Peer;

import java.io.InputStream;

/**
 * @Description 客户端网络传输接口
 * 客户端主要作用：1.创建连接  2.发送数据并等待响应  3.关闭连接
 * @Author wangweihong
 * @Date 2022/11/9 10:59
 * @Version 1.0
 */
public interface TransportClient {
    /**
     * 创建连接诶
     * @param peer 网络连接端点
     */
    void connect(Peer peer);

    /**
     * 写入并发送数据
     * @param data 数据
     * @return 输入流
     */
    InputStream write(InputStream data);


    /**
     * 关闭连接
     */
    void close();
}
