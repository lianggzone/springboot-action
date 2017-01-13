package com.lianggzone.springboot.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * <h3>概要:</h3><p>CusStatusHealthIndicator</p>
 * <h3>功能:</h3><p>自定义健康状态检测类</p>
 * <h3>履历:</h3>
 * <li>2017年01月12日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
//@Component
public class CusStatusHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = check(); 
        if (errorCode != 0) {
            return Health.down()
                    .withDetail("status", errorCode)
                    .withDetail("message", "服务故障")
                    .build();
        }
        return Health.up().build();
    }

    private int check(){
        // 对监控对象的检测操作  
        return HttpStatus.NOT_FOUND.value();
    }
}