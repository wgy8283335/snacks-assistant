package com.coconason.snacksassistantorder.clients;

import com.alibaba.fastjson.JSONArray;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import org.springframework.stereotype.Component;

@Component
public class SnacksAssistantGoodsFallback implements SnacksAssistantGoodsClient{
    @Override
    public SnacksResult deleteQuantitySnacksInventory(JSONArray goodsAndNum){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }
}
