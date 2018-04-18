package com.coconason.snacksassistantconsumer.model;

import com.alibaba.fastjson.JSON;


public class SnacksResult {


    // 响应业务状态
    private Integer code;

    // 响应消息
    private String message;

    // 响应中的数据
    private Object datum;



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

	public Object getDatum() {
		return datum;
	}

	public void setDatum(Object datum) {
		this.datum = datum;
	}

	public SnacksResult(){

    }

    public SnacksResult(Integer code, String message, Object datum) {
        this.code = code;
        this.message = message;
        this.datum = datum;
    }

    public SnacksResult(Object datum) {
        this.code = 200;
        this.message = "OK";
        this.datum = datum;
    }
    
    
    public static SnacksResult build(Integer code, String message, Object datum) {
        return new SnacksResult(code, message, datum);
    }
    
    public static SnacksResult build(Integer code, String message) {
        return new SnacksResult(code, message, null);
    }
    
    public static SnacksResult ok(Object datum) {
        return new SnacksResult(datum);
    }

    public static SnacksResult ok() {
        return new SnacksResult(null);
    }

    public static SnacksResult formatToList(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return JSON.parseObject(jsonData,SnacksResult.class);
            }
            SnacksResult snacksResult= JSON.parseObject(jsonData,SnacksResult.class);
            String data =snacksResult.getDatum().toString();
            Object obj=JSON.parseArray(data,clazz);
            snacksResult.setDatum(obj);
            return snacksResult;
        } catch (Exception e) {
            return null;
        }
    }    

    public static SnacksResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return JSON.parseObject(jsonData,SnacksResult.class);
            }
            SnacksResult snacksResult= JSON.parseObject(jsonData,SnacksResult.class);
            if(snacksResult.getCode()==200){
                String data =snacksResult.getDatum().toString();
                Object obj=JSON.parseObject(data,clazz);
                snacksResult.setDatum(obj);
            }
            return snacksResult;
        } catch (Exception e) {
            return null;
        }
    }

    public static SnacksResult format(String jsonData) {
        try {
            //return MAPPER.readValue(jsonData, snacksResult.class);
        	return JSON.parseObject(jsonData,SnacksResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
