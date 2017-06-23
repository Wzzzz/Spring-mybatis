package com.qq.qd.server.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangzhi.a on 2017/6/23.
 */
public interface Logs {
    //启动
    Logger boot = LoggerFactory.getLogger("boot");
    //请求
    Logger access = LoggerFactory.getLogger("access");
    //错误
    Logger error = LoggerFactory.getLogger("error");
}
