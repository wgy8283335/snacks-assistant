package com.coconason.snacksassistantorder.clients;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "snacks-assistant-goods",fallback = SnacksAssistantGoodsFallback.class)
public interface SnacksAssistantGoodsClient {
    @RequestMapping(value="/set_good_info",method = RequestMethod.POST)
    public SnacksResult setUserInfoVo(@RequestBody UserInfoVo userInfoVo);
}
