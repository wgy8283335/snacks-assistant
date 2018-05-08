package com.coconason.snacksassistantuser.service.impl;

import com.coconason.snacksassistantuser.cast.CastUtil;
import com.coconason.snacksassistantuser.constant.ErrorCode;
import com.coconason.snacksassistantuser.dao.UserInfoMapper;
import com.coconason.snacksassistantuser.model.SnacksResult;
import com.coconason.snacksassistantuser.po.UserInfo;
import com.coconason.snacksassistantuser.po.UserInfoExample;
import com.coconason.snacksassistantuser.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coconason.snacksassistantuser.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfoVo getUserInfoVo(long id) throws Exception{
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        UserInfoVo userInfoVo = CastUtil.UserInfoToUserInfoVo(userInfo);
        return userInfoVo;
    }
    @Override
    public SnacksResult deleteUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoCriteria = userInfoExample.createCriteria();
        userInfoCriteria.andIdEqualTo(userInfoVo.getId());
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
        userInfo.setDeleted((byte)1);//设置删除
        if (userInfoMapper.updateByExampleSelective(userInfo,userInfoExample)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
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
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
        userInfoMapper.insert(userInfo);
        if (userInfoMapper.insert(userInfo)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
}
