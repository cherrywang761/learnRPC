package com.hong.proto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Peer
 * @Description 网络传输断点类
 * @Author wangweihong
 * @Date 2022/11/8 15:09
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peer {
    private String host;
    private Integer port;

}
