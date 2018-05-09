package com.coconason.snacksassistantuser.service.impl;

import com.coconason.snacksassistantuser.cast.CastUtil;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantuser.dao.UserInfoMapper;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantuser.po.UserInfo;
import com.coconason.snacksassistantuser.po.UserInfoExample;
import com.coconason.snacksassistantuser.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coconason.snacksassistantuser.service.IUserInfoService;

import java.util.Date;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
        Date now = new Date();
        userInfo.setCreateTime(now);
        userInfo.setUpdateTime(now);
        userInfo.setDeleted(NO);
        if (userInfoMapper.insertSelective(userInfo)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteUserInfoVo(Long id) throws Exception{
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setDeleted(YES);
        if (userInfoMapper.updateByPrimaryKeySelective(userInfo)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoCriteria = userInfoExample.createCriteria();
        userInfoCriteria.andIdEqualTo(userInfoVo.getId());
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
         if (userInfoMapper.updateByExampleSelective(userInfo,userInfoExample)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public UserInfoVo getUserInfoVo(long id) throws Exception{
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return CastUtil.UserInfoToUserInfoVo(userInfo);
    }
}
