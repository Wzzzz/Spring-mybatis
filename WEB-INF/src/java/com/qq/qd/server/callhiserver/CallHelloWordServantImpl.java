package com.qq.qd.server.callhiserver;


import com.qq.cloud.taf.client.Communicator;
import com.qq.cloud.taf.client.CommunicatorConfig;
import com.qq.cloud.taf.client.CommunicatorFactory;

import com.qq.qd.server.callhiserver.CallHelloWordServant;
import com.qq.qd.server.hiserver.HelloWordPrx;

/**
 * Created by wangzhi.a on 2017/6/20.
 */

public class CallHelloWordServantImpl implements CallHelloWordServant{
/*
    public static Communicator communicatorwang;
    public static String SERVANT = "QD.HiServer.HiObj";
    public static String LOCATOR = "taf.tafregistry.QueryObj@taf.tafregistry.QueryObj@tcp -h 10.219.140.217 -p 17890:tcp -h 10.224.137.102 -p 17890";

    public static HelloWordPrx createHelloWordPrx(){
    Communicator communicator = getCommunicator(LOCATOR,communicatorwang);
    HelloWordPrx proxy = communicator.stringToProxy(HelloWordPrx.class, SERVANT);
    return proxy;
    }



    private static Communicator getCommunicator(String locator, Communicator communicator){
        if(communicator == null) {
            CommunicatorConfig config = new CommunicatorConfig();
            config.setLocator(locator);
            config.setCharsetName("UTF-8");
            communicator = CommunicatorFactory.getInstance().getCommunicator(config);
        }
        return communicator;
    }
  @Override
  public String CallsayHello() {
  HelloWordPrx proxy = createHelloWordPrx();
  String resultStr = proxy.sayHello();
  return resultStr;
  }
*/

  @Override
  public String CallsayHello() { return null;}
}
