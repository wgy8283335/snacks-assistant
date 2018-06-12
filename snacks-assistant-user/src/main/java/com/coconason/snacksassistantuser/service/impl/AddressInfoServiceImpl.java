package com.coconason.snacksassistantuser.service.impl;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.util.SnowflakeIdWorker;
import com.coconason.snacksassistantcommon.vo.AddressInfoWxVo;
import com.coconason.snacksassistantuser.cast.CastUtil;
import com.coconason.snacksassistantuser.dao.AddressInfoMapper;
import com.coconason.snacksassistantuser.dao.UserInfoMapper;
import com.coconason.snacksassistantuser.po.AddressInfo;
import com.coconason.snacksassistantuser.po.AddressInfoExample;
import com.coconason.snacksassistantuser.po.UserInfo;
import com.coconason.snacksassistantuser.po.UserInfoExample;
import com.coconason.snacksassistantuser.service.IAddressInfoService;
import com.coconason.snacksassistantcommon.vo.AddressInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class AddressInfoServiceImpl implements IAddressInfoService {

    @Autowired
    private AddressInfoMapper addressInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Value("${server-id}")
    private long serverId;
    @Value("${center-id}")
    private long dataCenterId;
    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addAddressInfoVo(AddressInfoVo addressInfoVo) throws Exception{
        AddressInfo addressInfo = CastUtil.AddressInfoVoToAddressInfo(addressInfoVo);
        Date now = new Date();
        addressInfo.setCreateTime(now);
        addressInfo.setUpdateTime(now);
        addressInfo.setDeleted(NO);
        addressInfo.setId(new SnowflakeIdWorker(serverId, dataCenterId).nextId());
        if (addressInfoMapper.insertSelective(addressInfo)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteAddressInfoVo(Long id) throws Exception{
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setId(id);
        addressInfo.setDeleted(YES);
        if (addressInfoMapper.updateByPrimaryKeySelective(addressInfo)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setAddressInfoVo(AddressInfoVo addressInfoVo) throws Exception{
        AddressInfoExample addressInfoExample = new AddressInfoExample();
        AddressInfoExample.Criteria addressInfoCriteria = addressInfoExample.createCriteria();
        addressInfoCriteria.andIdEqualTo(addressInfoVo.getId());
        AddressInfo addressInfo = CastUtil.AddressInfoVoToAddressInfo(addressInfoVo);
        Date now = new Date();
        addressInfo.setUpdateTime(now);
        if (addressInfoMapper.updateByExampleSelective(addressInfo,addressInfoExample)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public AddressInfoVo getAddressInfoVo(long id) throws Exception{
        AddressInfo addressInfo = addressInfoMapper.selectByPrimaryKey(id);
        return CastUtil.AddressInfoToAddressInfoVo(addressInfo);
    }
    @Override
    public List<AddressInfoVo> getAddressInfoVoList(Long userId) throws Exception {
        AddressInfoExample addressInfoExample = new AddressInfoExample();
        AddressInfoExample.Criteria addressInfoCriteria = addressInfoExample.createCriteria();
        addressInfoCriteria.andUserInfoIdEqualTo(userId);
        List<AddressInfo> addressInfoList = addressInfoMapper.selectByExample(addressInfoExample);
        return CastUtil.AddressInfoListToAddressInfoVoList(addressInfoList);
    }
    @Override
    public List<AddressInfoWxVo> getAddressInfoWxVoList(Long userId) throws Exception {
        AddressInfoExample addressInfoExample = new AddressInfoExample();
        AddressInfoExample.Criteria addressInfoCriteria = addressInfoExample.createCriteria();
        addressInfoCriteria.andUserInfoIdEqualTo(userId);
        addressInfoCriteria.andDeletedNotEqualTo((byte)1);
        List<AddressInfo> addressInfoList = addressInfoMapper.selectByExample(addressInfoExample);
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return CastUtil.AddressInfoListToAddressInfoWxVoList(addressInfoList,Long.parseLong(userInfo.getAddress()));
    }

}
