package com.coconason.snacksassistantgoods.service.impl;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.util.SnowflakeIdWorker;
import com.coconason.snacksassistantgoods.cast.CastUtil;
import com.coconason.snacksassistantgoods.dao.SnacksInventoryMapper;
import com.coconason.snacksassistantgoods.po.SnacksInventory;
import com.coconason.snacksassistantgoods.po.SnacksInventoryExample;
import com.coconason.snacksassistantgoods.service.ISnacksInventoryService;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class SnacksInventoryServiceImpl implements ISnacksInventoryService {

    @Autowired
    private SnacksInventoryMapper snacksInventoryMapper;
    @Value("${server-id}")
    private long serverId;
    @Value("${center-id}")
    private long dataCenterId;
    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addSnacksInventoryVo(SnacksInventoryVo snacksInventoryVo) throws Exception{
        SnacksInventory snacksInventory = CastUtil.SnacksInventoryVoToSnacksInventory(snacksInventoryVo);
        Date now = new Date();
        snacksInventory.setCreateTime(now);
        snacksInventory.setUpdateTime(now);
        snacksInventory.setDeleted(NO);
        snacksInventory.setId(new SnowflakeIdWorker(serverId, dataCenterId).nextId());
        if (snacksInventoryMapper.insertSelective(snacksInventory)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteSnacksInventoryVo(Long id) throws Exception{
        SnacksInventory snacksInventory = new SnacksInventory();
        snacksInventory.setId(id);
        snacksInventory.setDeleted(YES);
        if (snacksInventoryMapper.updateByPrimaryKeySelective(snacksInventory)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setSnacksInventoryVo(SnacksInventoryVo snacksInventoryVo) throws Exception{
        SnacksInventoryExample snacksInventoryExample = new SnacksInventoryExample();
        SnacksInventoryExample.Criteria snacksInventoryCriteria = snacksInventoryExample.createCriteria();
        snacksInventoryCriteria.andIdEqualTo(snacksInventoryVo.getId());
        SnacksInventory snacksInventory = CastUtil.SnacksInventoryVoToSnacksInventory(snacksInventoryVo);
        Date now = new Date();
        snacksInventory.setUpdateTime(now);
         if (snacksInventoryMapper.updateByExampleSelective(snacksInventory,snacksInventoryExample)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksInventoryVo getSnacksInventoryVo(long id) throws Exception{
        SnacksInventory snacksInventory = snacksInventoryMapper.selectByPrimaryKey(id);
        return CastUtil.SnacksInventoryToSnacksInventoryVo(snacksInventory);
    }
}
