package com.coconason.snacksassistantorder.clients;

import com.alibaba.fastjson.JSONArray;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "snacks-assistant-goods",fallback = SnacksAssistantGoodsFallback.class)
public interface SnacksAssistantGoodsClient {
    @RequestMapping(value="/delete_quantity_snacks_inventory",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteQuantitySnacksInventory(@RequestBody JSONArray goodsAndNum);
}
