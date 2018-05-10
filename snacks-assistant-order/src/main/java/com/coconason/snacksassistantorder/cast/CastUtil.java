package com.coconason.snacksassistantorder.cast;

import com.coconason.snacksassistantorder.po.OrderInfo;
import com.coconason.snacksassistantorder.vo.OrderInfoVo;

public class CastUtil {

	public static OrderInfoVo OrderInfoToOrderInfoVo(OrderInfo orderInfo){
		OrderInfoVo orderInfoVo = new OrderInfoVo();
		orderInfoVo.setAddress(orderInfo.getAddress());
		orderInfoVo.setAmount(orderInfo.getAmount());
		orderInfoVo.setDeduction(orderInfo.getDeduction());
		orderInfoVo.setDiscount(orderInfo.getDiscount());
		orderInfoVo.setGoods(orderInfo.getGoods());
		orderInfoVo.setId(orderInfo.getId());
		orderInfoVo.setPhoneNumber(orderInfo.getPhoneNumber());
		orderInfoVo.setReceptionTimeLowerLimit(orderInfo.getReceptionTimeLowerLimit());
		orderInfoVo.setReceptionTimeUpperLimit(orderInfo.getReceptionTimeUpperLimit());
		orderInfoVo.setRecipient(orderInfo.getRecipient());
		orderInfoVo.setStatus(orderInfo.getStatus());
		orderInfoVo.setTotal(orderInfo.getTotal());
		orderInfoVo.setUserId(orderInfo.getUserId());
		return orderInfoVo;
	}	
	public static OrderInfo OrderInfoVoToOrderInfo(OrderInfoVo orderInfoVo){
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setAddress(orderInfoVo.getAddress());
		orderInfo.setAmount(orderInfoVo.getAmount());
		orderInfo.setDeduction(orderInfoVo.getDeduction());
		orderInfo.setDiscount(orderInfoVo.getDiscount());
		orderInfo.setGoods(orderInfoVo.getGoods());
		orderInfo.setId(orderInfoVo.getId());
		orderInfo.setPhoneNumber(orderInfoVo.getPhoneNumber());
		orderInfo.setReceptionTimeLowerLimit(orderInfoVo.getReceptionTimeLowerLimit());
		orderInfo.setReceptionTimeUpperLimit(orderInfoVo.getReceptionTimeUpperLimit());
		orderInfo.setRecipient(orderInfoVo.getRecipient());
		orderInfo.setStatus(orderInfoVo.getStatus());
		orderInfo.setTotal(orderInfoVo.getTotal());
		orderInfo.setUserId(orderInfoVo.getUserId());
		return orderInfo;
	}

}
