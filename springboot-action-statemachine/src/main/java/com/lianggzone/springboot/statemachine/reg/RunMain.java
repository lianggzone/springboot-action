package com.lianggzone.springboot.statemachine.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.statemachine.StateMachine;

import com.lianggzone.springboot.statemachine.reg.enums.RegEventEnum;
import com.lianggzone.springboot.statemachine.reg.enums.RegStatusEnum;

/**
 * <h3>概要:</h3><p>RunMain</p>
 * <h3>功能:</h3><p>RunMain</p>
 * <h3>履历:</h3>
 * <li>2017年3月21日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.lianggzone.springboot" })
public class RunMain implements CommandLineRunner {
    
    @Autowired
    private StateMachine<RegStatusEnum, RegEventEnum> stateMachine;
    
    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
    }

    

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        stateMachine.sendEvent(RegEventEnum.CONNECT);
        stateMachine.sendEvent(RegEventEnum.REGISTER);
        stateMachine.sendEvent(RegEventEnum.REGISTER_SUCCESS);
        stateMachine.sendEvent(RegEventEnum.UN_REGISTER);
        
        stateMachine.sendEvent(RegEventEnum.CONNECT);
    }
}