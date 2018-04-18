package com.coconason.snacksassistantuser.service;

import com.coconason.snacksassistantuser.vo.UserInfoVo;
import com.coconason.snacksassistantuser.model.SnacksResult;
import com.coconason.snacksassistantuser.po.UserInfo;

public interface IUserInfoService {

    UserInfoVo getUserInfoVo(long id) throws Exception;

    SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception;
}
