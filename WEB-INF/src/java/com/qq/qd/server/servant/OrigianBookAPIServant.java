package com.qq.qd.server.servant;

import com.qq.cloud.taf.common.annotation.*;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceService
public interface OrigianBookAPIServant {

	public String test(@JceParameter(name = "freetype") long freetype);

	public String test1(@JceParameter(name = "app_id") String app_id, @JceParameter(name = "freetype") long freetype);

	public String test2(@JceParameter(name = "app_id") String app_id, @JceParameter(name = "params") java.util.Map<String, String> params);

	public String test3(@JceParameter(name = "app_id") String app_id);
}
