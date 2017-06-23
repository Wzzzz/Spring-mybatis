package com.qq.qd.server.Impl;
import com.alibaba.fastjson.JSON;
import com.qq.qd.server.servant.OrigianBookAPIServant;
import com.qq.qd.server.utils.TafLogs;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.StringValueExp;
import java.util.Map;

/**
 * Created by wangzhi.a on 2017/6/21.
 */
public class OrigianBookAPIServantImpl implements OrigianBookAPIServant {

    public OrigianBookAPIServant servant;

    public OrigianBookAPIServantImpl() {
//      LoggerFactory.getLogger("boot").info("{}", AppListener.getContext());
        TafLogs.boot.info("starting ...");
        try {
            this.servant = (OrigianBookAPIServant) new ClassPathXmlApplicationContext("classpath:application-context.xml").getBean("apiServant");
        } catch (Exception e) {
            TafLogs.access.error("error:",e);
        }
        TafLogs.boot.info("started !");
    }

    public static int times = 0;

    @Override
    public String test(long freetype) {
        times++;
        TafLogs.access.info("CallTimes:"+String.valueOf(times));
        return "hello1";
    }

    @Override
    public String test1(String app_id, long freetype) {
        times++;
        TafLogs.access.info("CallTimes:"+String.valueOf(times));
        return servant.test1(app_id,freetype);
    }

    @Override
    public String test2(String app_id, Map<String, String> params) {
        times++;
        TafLogs.access.info("CallTimes:"+String.valueOf(times));
        return servant.test2(app_id,params);
    }

    @Override
    public String test3(String app_id) {
        times++;
        TafLogs.access.info("CallTimes:"+String.valueOf(times));
        return servant.test3(app_id);
    }
}
