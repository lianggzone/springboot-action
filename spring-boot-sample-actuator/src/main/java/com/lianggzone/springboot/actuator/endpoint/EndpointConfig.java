package com.lianggzone.springboot.actuator.endpoint;

import java.util.Map;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>概要:</h3><p>EndpointConfig</p>
 * <h3>功能:</h3><p>端点配置类</p>
 * <h3>履历:</h3>
 * <li>2017年1月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Configuration
public class EndpointConfig {

	@Bean
	public static Endpoint<Map<String, Object>> servertime() {
		return new ServerTimeEndpoint();
	}
}