package com.lianggzone.springboot.statemachine.reg.enums;

/**
 * <h3>概要:</h3><p>RegEventEnum</p>
 * <h3>功能:</h3><p>注册事件枚举</p>
 * <h3>履历:</h3>
 * <li>2017年3月21日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public enum RegEventEnum {

	// 连接
    CONNECT(1),
	// 注册
    REGISTER(2),
    // 注册成功
    REGISTER_SUCCESS(3),
    // 注册失败
    REGISTER_FAILED(4),
    // 注销
    UN_REGISTER(5);

	private int value;

	private RegEventEnum(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}