package com.qq.qd.server.Impl;

import com.qq.cloud.taf.server.core.AppContextEvent;
import com.qq.cloud.taf.server.core.AppContextListener;
import com.qq.cloud.taf.server.core.AppServiceEvent;
import com.qq.cloud.taf.server.core.ServiceHomeSkeleton;
import com.qq.cloud.taf.support.om.ConfigHelper;
import com.qq.qd.server.utils.TafLogs;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangzhi.a on 2017/6/22.
 */
public class AppListener implements AppContextListener {
    @Override
    public void appContextStarted(AppContextEvent appContextEvent) {
    }
    @Override
    public void appServiceStarted(AppServiceEvent appServiceEvent) {
    }
/*
    private static Map<Class<?>, Object> servants = new HashMap<>();
    private static ApplicationContext context = null;

    @Override
    public void appContextStarted(AppContextEvent appContextEvent) {
        ConfigHelper.getInstance().loadConfig("config.properties");
        ConfigHelper.getInstance().loadConfig("application-context.xml");
        ConfigHelper.getInstance().loadConfig("mapper.xml");
    }

    @Override
    public void appServiceStarted(AppServiceEvent appServiceEvent) {
        ServiceHomeSkeleton skeleton = (ServiceHomeSkeleton) appServiceEvent.getAppService();
        servants.put(skeleton.getApiClass(), skeleton.getService());
        TafLogs.boot.info("ApiClass:"+skeleton.getApiClass()+",Service:"+skeleton.getService().toString());
    }

    public static final <T> T getServant(Class<T> apiClass) {
        return (T) servants.get(apiClass);
    }

    public static final ApplicationContext getContext() {
        return context;
    }
*/
}
