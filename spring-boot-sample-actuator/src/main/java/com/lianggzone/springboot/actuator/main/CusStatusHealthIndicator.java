package com.lianggzone.springboot.actuator.main;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

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