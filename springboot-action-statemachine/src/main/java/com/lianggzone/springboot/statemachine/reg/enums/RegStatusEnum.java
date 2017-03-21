package com.lianggzone.springboot.statemachine.reg.enums;

/**
 * <h3>概要:</h3><p>RegStatusEnum</p>
 * <h3>功能:</h3><p>注册状态枚举</p>
 * <h3>履历:</h3>
 * <li>2017年3月21日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public enum RegStatusEnum {

	// 未连接
    UNCONNECTED,
    // 已连接
    CONNECTED,
    // 注册中
    REGISTERING,
    // 已注册
    REGISTERED;

}