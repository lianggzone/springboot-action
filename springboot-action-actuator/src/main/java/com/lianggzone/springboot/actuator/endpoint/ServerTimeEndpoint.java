package com.lianggzone.springboot.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <h3>概要:</h3><p>ServerTimeEndpoint</p>
 * <h3>功能:</h3><p>服务器时间端点类</p>
 * <h3>履历:</h3>
 * <li>2017年1月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@ConfigurationProperties(prefix = "endpoints.servertime")
public class ServerTimeEndpoint extends AbstractEndpoint<Map<String, Object>> {

	public ServerTimeEndpoint() {
		super("servertime", false);
	}

	@Override
	public Map<String, Object> invoke() {
	    Map<String, Object> result = new HashMap<String, Object>();
        DateTime dateTime = DateTime.now();
        result.put("server_time", dateTime.toString());
        result.put("ms_format", dateTime.getMillis());
        return result;
	}
}
