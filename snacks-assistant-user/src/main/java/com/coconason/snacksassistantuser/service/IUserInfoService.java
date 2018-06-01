package com.coconason.snacksassistantuser.service;


import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;

import java.util.List;

public interface IUserInfoService {

    SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    SnacksResult deleteUserInfoVo(Long id) throws Exception;

    SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception;

    UserInfoVo getUserInfoVo(long id) throws Exception;

    List<UserInfoVo> getUserInfoVoList(UserInfoVo userInfoVo) throws Exception;


}
