package com.qq.qd.server.service;

import com.qq.qd.server.DAO.OrigianBookDAO;
import com.qq.qd.server.model.OrigianBookEx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by wangzhi.a on 2017/6/21.
 */
@Service("bookservice")
public class Bookservice {

    @Resource
    private OrigianBookDAO origianbookdao;

    public List<OrigianBookEx> getbook(long freetype){
    List<OrigianBookEx> list = origianbookdao.getOrigianBookEx(freetype);
    return list;
    }
}
