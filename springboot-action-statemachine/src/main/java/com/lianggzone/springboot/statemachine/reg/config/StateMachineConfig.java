package com.lianggzone.springboot.statemachine.reg.config;

import java.util.EnumSet;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import com.lianggzone.springboot.statemachine.reg.enums.RegEventEnum;
import com.lianggzone.springboot.statemachine.reg.enums.RegStatusEnum;

/**
 * <h3>概要:</h3><p>StateMachineConfig</p>
 * <h3>功能:</h3><p>StateMachineConfig</p>
 * <h3>履历:</h3>
 * <li>2017年3月21日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<RegStatusEnum, RegEventEnum> {

    /**
     * 初始化状态机状态
     */
    @Override
    public void configure(StateMachineStateConfigurer<RegStatusEnum, RegEventEnum> states) throws Exception {
        states.withStates()
        // 定义初始状态
        .initial(RegStatusEnum.UNCONNECTED)
        // 定义状态机状态
        .states(EnumSet.allOf(RegStatusEnum.class));
    }
    /**
     * 初始化状态迁移事件
     */
    @Override
    public void configure(StateMachineTransitionConfigurer<RegStatusEnum, RegEventEnum> transitions)
            throws Exception {
        transitions
            // 1.连接事件
            // 未连接 -> 已连接
            .withExternal()
                .source(RegStatusEnum.UNCONNECTED)
                .target(RegStatusEnum.CONNECTED)
                .event(RegEventEnum.CONNECT)
            .and()                     
            
            // 2.注册事件   
            // 已连接 -> 注册中
            .withExternal()
                .source(RegStatusEnum.CONNECTED)
                .target(RegStatusEnum.REGISTERING)
                .event(RegEventEnum.REGISTER)
            .and()
            
            // 3.注册成功事件   
            // 注册中 -> 已注册
            .withExternal()
                .source(RegStatusEnum.REGISTERING)
                .target(RegStatusEnum.REGISTERED)
                .event(RegEventEnum.REGISTER_SUCCESS)
            .and()
            
            // 5.注销事件
            // 已连接 -> 未连接
            .withExternal()
                .source(RegStatusEnum.CONNECTED)
                .target(RegStatusEnum.UNCONNECTED)
                .event(RegEventEnum.UN_REGISTER)
            .and()
            // 注册中 -> 未连接
            .withExternal()
                .source(RegStatusEnum.REGISTERING)
                .target(RegStatusEnum.UNCONNECTED)
                .event(RegEventEnum.UN_REGISTER)
            .and()
            // 已注册 -> 未连接
            .withExternal()
                .source(RegStatusEnum.REGISTERED)
                .target(RegStatusEnum.UNCONNECTED)
                .event(RegEventEnum.UN_REGISTER)
            ;
    }
}