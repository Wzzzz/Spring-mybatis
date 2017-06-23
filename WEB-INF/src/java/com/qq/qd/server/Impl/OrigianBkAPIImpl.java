package com.qq.qd.server.Impl;

import com.qq.qd.server.model.OrigianBookEx;
import com.qq.qd.server.servant.OrigianBookAPIServant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.qq.qd.server.service.Bookservice;

import java.util.List;
import java.util.Map;

/**
 * Created by wangzhi.a on 2017/6/21.
 */
@Service("apiServant")
public class OrigianBkAPIImpl implements OrigianBookAPIServant {

    @Resource
    private Bookservice bookservice;

    @Override
    public String test(long freetype) {
    return "hello1";
    }

    @Override
    public String test1(String app_id, long freetype) {
    List<OrigianBookEx> result = bookservice.getbook(freetype);
    StringBuffer res = new StringBuffer();
    for(int i=0; i<5; i++) {
        res.append(result.get(i).toString());
    }
    return res.toString();
    }

    @Override
    public String test2(String app_id, Map<String, String> params) {
        return null;
    }

    @Override
    public String test3(String app_id) {
        return "hellowwww";
    }
}
