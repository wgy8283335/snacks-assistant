package com.coconason.snacksassistantconsumer.clinets;


import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "snacks-assistant-user",fallback = SnacksAssistantUserFallback.class)
public interface SnacksAssistantUserClient {

	@RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET)
	public SnacksResult getUserInfoVo(@PathVariable("id") Long id);

	@RequestMapping(value="/get_user_info_list",method = RequestMethod.POST)
	public SnacksResult getUserInfoVoList(@RequestBody UserInfoVo userInfoVo);

	@RequestMapping(value="/set_user_info",method = RequestMethod.POST)
	public SnacksResult setUserInfoVo(@RequestBody UserInfoVo userInfoVo);


}
