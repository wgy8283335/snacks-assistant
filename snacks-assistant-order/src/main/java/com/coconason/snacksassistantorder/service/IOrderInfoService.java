package com.coconason.snacksassistantorder.service;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantorder.vo.OrderInfoVo;

public interface IOrderInfoService {

    SnacksResult addOrderInfoVo(OrderInfoVo orderInfoVo) throws Exception;

    SnacksResult deleteOrderInfoVo(Long id) throws Exception;

    SnacksResult setOrderInfoVo(OrderInfoVo orderInfoVo) throws Exception;

    OrderInfoVo getOrderInfoVo(long id) throws Exception;

}
