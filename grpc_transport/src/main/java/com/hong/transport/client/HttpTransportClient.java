package com.hong.transport.client;

import com.hong.proto.model.Peer;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName HttpTransportClient
 * @Description http客户端类
 * @Author wangweihong
 * @Date 2022/11/9 11:49
 * @Version 1.0
 */
public class HttpTransportClient implements TransportClient {

    //请求路径
    private String url;

    @Override
    public void connect(Peer peer) {
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public InputStream write(InputStream data) {
        try {
            //通过url构建http连接请求
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            /**
             * URL 连接可用于输入和/或输出。如果打算使用 URL 连接进行输入，则将 DoInput 标志设置为 true；
             * 如果不打算使用，则设置为 false。默认值为 true。
             * （因为总是使用conn.getInputStream()获取服务端的响应，所以设置成true。
             */
            conn.setDoOutput(true);
//            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.connect();
            IOUtils.copy(data, conn.getOutputStream());
            int code = conn.getResponseCode();
            if(HttpURLConnection.HTTP_OK == code){
                return conn.getInputStream();
            }
            return conn.getErrorStream();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public void close() {

    }
}
