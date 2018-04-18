package com.coconason.snacksassistantconsumer.service;

import com.coconason.snacksassistantconsumer.model.SnacksResult;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;

public interface IUserInfoService {

    public SnacksResult getUserInfoVo(Long id) throws Exception;

    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception;
}
