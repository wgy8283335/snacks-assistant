package com.coconason.snacksassistantgoods.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    @Override
    public SnacksResult deleteQuantitySnacksInventory(JSONArray goodsAndNum) throws Exception {
        for(int i=0;i<goodsAndNum.size();i++){
            JSONObject goodsAndNumItem = goodsAndNum.getJSONObject(i);
            Long id = (Long)goodsAndNumItem.get("id");
            Integer num = (Integer)goodsAndNumItem.get("num");
            SnacksInventoryExample snacksInventoryExample = new SnacksInventoryExample();
            SnacksInventoryExample.Criteria snacksInventoryCriteria = snacksInventoryExample.createCriteria();
            snacksInventoryCriteria.andSnacksInfoIdEqualTo(id);
            snacksInventoryCriteria.andDeletedEqualTo((byte)0);
            List<SnacksInventory> snacksInventoryList= snacksInventoryMapper.selectByExample(snacksInventoryExample);
            boolean flag =false;
            for(SnacksInventory snacksInventory:snacksInventoryList) {
                if(flag == false){
                    if (num <= snacksInventory.getQuantity()) {
                        SnacksInventoryExample snacksInventoryExample1 = new SnacksInventoryExample();
                        SnacksInventoryExample.Criteria snacksInventoryCriteria1 = snacksInventoryExample1.createCriteria();
                        snacksInventoryCriteria1.andSnacksInfoIdEqualTo(id);
                        snacksInventoryCriteria1.andDeletedEqualTo((byte)0);
                        snacksInventoryCriteria1.andIdEqualTo(snacksInventory.getId());
                        snacksInventory.setQuantity(snacksInventory.getQuantity() - num);
                        num = 0;
                        snacksInventoryMapper.updateByExampleSelective(snacksInventory,snacksInventoryExample1);
                        flag = true;
                    }else {
                        SnacksInventoryExample snacksInventoryExample2 = new SnacksInventoryExample();
                        SnacksInventoryExample.Criteria snacksInventoryCriteria2 = snacksInventoryExample2.createCriteria();
                        snacksInventoryCriteria2.andSnacksInfoIdEqualTo(id);
                        snacksInventoryCriteria2.andDeletedEqualTo((byte)0);
                        num = num - snacksInventory.getQuantity();
                        snacksInventoryCriteria2.andIdEqualTo(snacksInventory.getId());
                        snacksInventory.setQuantity(0);
                        snacksInventory.setDeleted((byte)1);
                        snacksInventoryMapper.updateByExampleSelective(snacksInventory,snacksInventoryExample2);
                    }
                }
            }
            if(num > 0){
                return new SnacksResult().build(ErrorCode.GOODS_NOT_ENOUGH.value(),ErrorCode.GOODS_NOT_ENOUGH.msg());
            }
        }
        return new SnacksResult().ok();
    }
}
