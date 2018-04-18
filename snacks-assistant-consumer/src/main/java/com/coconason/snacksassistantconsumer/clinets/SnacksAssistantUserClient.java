package com.coconason.snacksassistantconsumer.clinets;

import com.coconason.snacksassistantconsumer.model.SnacksResult;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "snacks-assistant-user",fallback = SnacksAssistantUserFallback.class)
public interface SnacksAssistantUserClient {

	@RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET)
	public SnacksResult getUserInfoVo(@PathVariable("id") Long id);

	@RequestMapping(value="/set_user_info",method = RequestMethod.POST)
	public SnacksResult setUserInfoVo(@RequestBody UserInfoVo userInfoVo);

}
