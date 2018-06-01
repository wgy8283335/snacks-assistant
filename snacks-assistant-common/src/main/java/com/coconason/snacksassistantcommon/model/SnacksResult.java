package com.coconason.snacksassistantcommon.model;

import java.io.Serializable;


public class SnacksResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    // 响应业务状态
    private Integer code;
    // 响应消息
    private String message;
    // 响应中的数据
    private T datum;

    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    public T getDatum() {
        return datum;
    }

    public void setDatum(T datum) {
        this.datum = datum;
    }

    public SnacksResult(){

    }

    public SnacksResult(Integer code, String message, T datum) {
        this.code = code;
        this.message = message;
        this.datum = datum;
    }

    public SnacksResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.datum = null;
    }

    public SnacksResult(T datum) {
        this.code = 200;
        this.message = "OK";
        this.datum = datum;
    }

    public SnacksResult build(Integer code, String message, T datum) {
        return new SnacksResult(code, message, datum);
    }
    public SnacksResult build(Integer code, String message) {
        return new SnacksResult(code, message, null);
    }
    
    public SnacksResult ok(T datum) {
        return new SnacksResult(datum);
    }

    public SnacksResult ok() {
        return new SnacksResult(null);
    }


}
