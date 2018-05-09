package com.coconason.snacksassistantuser.service;

import com.coconason.snacksassistantuser.vo.UserInfoVo;
import com.coconason.snacksassistantcommon.model.SnacksResult;

public interface IUserInfoService {

    SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    SnacksResult deleteUserInfoVo(Long id) throws Exception;

    SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    UserInfoVo getUserInfoVo(long id) throws Exception;




}
