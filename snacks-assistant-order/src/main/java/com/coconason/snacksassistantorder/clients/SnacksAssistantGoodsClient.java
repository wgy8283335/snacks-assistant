package com.coconason.snacksassistantorder.clients;

import com.alibaba.fastjson.JSONArray;
import com.coconason.snacksassistantcommon.model.SnacksResult;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "snacks-assistant-goods",fallback = SnacksAssistantGoodsFallback.class)
public interface SnacksAssistantGoodsClient {
    @RequestMapping(value="/delete_quantity_snacks_inventory",method = RequestMethod.POST)
    public SnacksResult deleteQuantitySnacksInventory(@RequestBody JSONArray goodsAndNum);
}
