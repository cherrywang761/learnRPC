package com.hong.transport.client;


/**
 * @Description 服务端网络传输接口
 * 服务端主要作用: 1.启动监听端口  2.接收请求  3.关闭监听
 * @Author wangweihong
 * @Date 2022/11/9 11:06
 * @Version 1.0
 */
public interface TransportServer {

    void init(int port,RequestHandler handler);

    void start();

    void stop();
}
