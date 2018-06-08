package com.coconason.snacksassistantuser.service.impl;

import com.coconason.snacksassistantcommon.util.SnowflakeIdWorker;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantuser.cast.CastUtil;
import com.coconason.snacksassistantuser.dao.UserInfoMapper;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantuser.po.UserInfo;
import com.coconason.snacksassistantuser.po.UserInfoExample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.coconason.snacksassistantuser.service.IUserInfoService;

import java.util.Date;
import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Value("${server-id}")
    private long serverId;
    @Value("${center-id}")
    private long dataCenterId;

    private final byte NO = 0;
    private final byte YES = 1;
    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(UserInfoServiceImpl.class);

    @Override
    public SnacksResult addUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
        Date now = new Date();
        userInfo.setId(new SnowflakeIdWorker(serverId, dataCenterId).nextId());
        userInfo.setCreateTime(now);
        userInfo.setUpdateTime(now);
        userInfo.setDeleted(NO);
        if (userInfoMapper.insertSelective(userInfo)>0){
            return new SnacksResult(ErrorCode.OK.value(),ErrorCode.OK.msg());
        }else{
            return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteUserInfoVo(Long id) throws Exception{
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setDeleted(YES);
        if (userInfoMapper.updateByPrimaryKeySelective(userInfo)>0){
            return new SnacksResult(ErrorCode.OK.value(),ErrorCode.OK.msg());
        }else{
            return new SnacksResult(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoCriteria = userInfoExample.createCriteria();
        userInfoCriteria.andIdEqualTo(userInfoVo.getId());
        LOG.info("Service");
        UserInfo userInfo = CastUtil.UserInfoVoToUserInfo(userInfoVo);
        Date now = new Date();
        userInfo.setUpdateTime(now);
        LOG.info(userInfo.getReceptionTimeUpperLimit());
         if (userInfoMapper.updateByExampleSelective(userInfo,userInfoExample)>0){
             return new SnacksResult(ErrorCode.OK.value(),ErrorCode.OK.msg());
         }else{
             return new SnacksResult(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
         }
    }
    @Override
    public UserInfoVo getUserInfoVo(long id) throws Exception{
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return CastUtil.UserInfoToUserInfoVo(userInfo);
    }
    @Override
    public List<UserInfoVo> getUserInfoVoList(UserInfoVo userInfoVo) throws Exception{
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria userInfoCriteria = userInfoExample.createCriteria();
        userInfoCriteria.andIdGreaterThan(userInfoVo.getId());
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        return CastUtil.UserInfoListToUserInfoVoList(userInfoList);
    }
}
