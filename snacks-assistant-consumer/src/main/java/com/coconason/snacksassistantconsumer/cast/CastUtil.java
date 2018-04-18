package com.coconason.snacksassistantconsumer.cast;

import com.alibaba.fastjson.JSONObject;
import com.coconason.snacksassistantconsumer.model.SnacksResult;
import com.alibaba.fastjson.JSON;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;

public class CastUtil<T> {

	public static SnacksResult jasonStringToSnacksResult(String jsonData, Class tclass){
		SnacksResult snacksResult = JSON.parseObject(jsonData,SnacksResult.class);
		if(snacksResult.getCode()==200){
			JSONObject datumJson=(JSONObject)snacksResult.getDatum();
			snacksResult.setDatum(JSON.parseObject(datumJson.toJSONString(),tclass));
			return snacksResult;
		}else{
			return snacksResult;
		}
	}

}
