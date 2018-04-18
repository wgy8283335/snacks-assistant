package com.coconason.snacksassistantconsumer.constant;


public enum ErrorCode {
	OK(200),
	//系统错误
	SYS_ERROR(100000);

	
	private final Integer value;

	private ErrorCode(Integer value) {
		this.value = value;
	}
	/**
	 * Return the integer value of this status code.
	 */
	public Integer value() {
		return this.value;
	}
	public String toString() {
		return this.value.toString();
	}
	public String msg() {
		return ("HTTPCODE_" + this.value);
	}

	
	
}
