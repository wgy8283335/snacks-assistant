package com.coconason.snacksassistantuser.service;

import com.coconason.snacksassistantuser.vo.UserInfoVo;
import com.coconason.snacksassistantuser.model.SnacksResult;

public interface IUserInfoService {

    SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    SnacksResult deleteUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    UserInfoVo getUserInfoVo(long id) throws Exception;




}
