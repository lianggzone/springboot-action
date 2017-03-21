package com.lianggzone.springboot.statemachine.reg.config;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/**
 * <h3>概要:</h3><p>StateMachineConfig</p>
 * <h3>功能:</h3><p>StateMachineConfig</p>
 * <h3>履历:</h3>
 * <li>2017年3月21日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@WithStateMachine
public class StateMachineEventConfig {

    @OnTransition(source = "UNCONNECTED", target = "CONNECTED")
    public void connect() {
        System.out.println("///////////////////");
        System.out.println("连接事件, 未连接 -> 已连接");
        System.out.println("///////////////////");
    }
    
    @OnTransition(source = "CONNECTED", target = "REGISTERING")
    public void register() {
        System.out.println("///////////////////");
        System.out.println("注册事件, 已连接 -> 注册中");
        System.out.println("///////////////////");
    }
    
    @OnTransition(source = "REGISTERING", target = "REGISTERED")
    public void registerSuccess() {
        System.out.println("///////////////////");
        System.out.println("注册成功事件, 注册中 -> 已注册");
        System.out.println("///////////////////");
    }
    
    @OnTransition(source = "REGISTERED", target = "UNCONNECTED")
    public void unRegister() {
        System.out.println("///////////////////");
        System.out.println("注销事件, 已注册 -> 未连接");
        System.out.println("///////////////////");
    }
}