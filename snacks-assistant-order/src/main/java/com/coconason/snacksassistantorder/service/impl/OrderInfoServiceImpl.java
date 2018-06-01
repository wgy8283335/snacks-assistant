package com.coconason.snacksassistantorder.service.impl;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.util.SnowflakeIdWorker;
import com.coconason.snacksassistantorder.cast.CastUtil;
import com.coconason.snacksassistantorder.dao.OrderInfoMapper;
import com.coconason.snacksassistantorder.po.OrderInfo;
import com.coconason.snacksassistantorder.po.OrderInfoExample;
import com.coconason.snacksassistantorder.service.IOrderInfoService;
import com.coconason.snacksassistantorder.vo.OrderInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderInfoServiceImpl implements IOrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Value("${server-id}")
    private long serverId;
    @Value("${center-id}")
    private long dataCenterId;
    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addOrderInfoVo(OrderInfoVo orderInfoVo) throws Exception{
        OrderInfo orderInfo = CastUtil.OrderInfoVoToOrderInfo(orderInfoVo);
        Date now = new Date();
        orderInfo.setCreateTime(now);
        orderInfo.setUpdateTime(now);
        orderInfo.setDeleted(NO);
        orderInfo.setId(new SnowflakeIdWorker(serverId, dataCenterId).nextId());
        if (orderInfoMapper.insertSelective(orderInfo)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteOrderInfoVo(Long id) throws Exception{
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId(id);
        orderInfo.setDeleted(YES);
        if (orderInfoMapper.updateByPrimaryKeySelective(orderInfo)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setOrderInfoVo(OrderInfoVo orderInfoVo) throws Exception{
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
        orderInfoCriteria.andIdEqualTo(orderInfoVo.getId());
        OrderInfo orderInfo = CastUtil.OrderInfoVoToOrderInfo(orderInfoVo);
        Date now = new Date();
        orderInfo.setUpdateTime(now);
         if (orderInfoMapper.updateByExampleSelective(orderInfo,orderInfoExample)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public OrderInfoVo getOrderInfoVo(long id) throws Exception{
        OrderInfo orderInfo = orderInfoMapper.selectByPrimaryKey(id);
        return CastUtil.OrderInfoToOrderInfoVo(orderInfo);
    }
}
