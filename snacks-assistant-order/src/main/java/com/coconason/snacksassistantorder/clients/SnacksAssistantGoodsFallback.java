package com.coconason.snacksassistantorder.clients;

import com.alibaba.fastjson.JSONArray;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;
import org.springframework.stereotype.Component;

@Component
public class SnacksAssistantGoodsFallback {

    public SnacksResult deleteQuantitySnacksInventory(JSONArray goodsAndNum){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }
}
