package com.coconason.snacksassistantgoods.service.impl;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.cast.CastUtil;
import com.coconason.snacksassistantgoods.dao.SnacksInfoMapper;
import com.coconason.snacksassistantgoods.po.SnacksInfo;
import com.coconason.snacksassistantgoods.po.SnacksInfoExample;
import com.coconason.snacksassistantgoods.service.ISnacksInfoService;
import com.coconason.snacksassistantgoods.vo.SnacksInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SnacksInfoServiceImpl implements ISnacksInfoService {

    @Autowired
    private SnacksInfoMapper snacksInfoMapper;

    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addSnacksInfoVo(SnacksInfoVo snacksInfoVo) throws Exception{
        SnacksInfo snacksInfo = CastUtil.SnacksInfoVoToSnacksInfo(snacksInfoVo);
        Date now = new Date();
        snacksInfo.setCreateTime(now);
        snacksInfo.setUpdateTime(now);
        snacksInfo.setDeleted(NO);
        if (snacksInfoMapper.insertSelective(snacksInfo)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteSnacksInfoVo(Long id) throws Exception{
        SnacksInfo snacksInfo = new SnacksInfo();
        snacksInfo.setId(id);
        snacksInfo.setDeleted(YES);
        if (snacksInfoMapper.updateByPrimaryKeySelective(snacksInfo)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setSnacksInfoVo(SnacksInfoVo snacksInfoVo) throws Exception{
        SnacksInfoExample snacksInfoExample = new SnacksInfoExample();
        SnacksInfoExample.Criteria snacksInfoCriteria = snacksInfoExample.createCriteria();
        snacksInfoCriteria.andIdEqualTo(snacksInfoVo.getId());
        SnacksInfo snacksInfo = CastUtil.SnacksInfoVoToSnacksInfo(snacksInfoVo);
        Date now = new Date();
        snacksInfo.setUpdateTime(now);
         if (snacksInfoMapper.updateByExampleSelective(snacksInfo,snacksInfoExample)>0){
            return SnacksResult.ok();
        }else{
            return SnacksResult.build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksInfoVo getSnacksInfoVo(long id) throws Exception{
        SnacksInfo snacksInfo = snacksInfoMapper.selectByPrimaryKey(id);
        return CastUtil.SnacksInfoToSnacksInfoVo(snacksInfo);
    }
}
