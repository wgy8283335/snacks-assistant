package com.coconason.snacksassistantorder.cast;

import com.coconason.snacksassistantcommon.vo.OrderInfoVo;
import com.coconason.snacksassistantorder.po.OrderInfo;

import java.util.ArrayList;
import java.util.List;

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
		orderInfoVo.setGoodsReceiveTime(orderInfo.getGoodsReceiveTime());
		orderInfoVo.setGoodsSendTime(orderInfo.getGoodsSendTime());
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
		orderInfo.setGoodsReceiveTime(orderInfoVo.getGoodsReceiveTime());
		orderInfo.setGoodsSendTime(orderInfoVo.getGoodsSendTime());
		orderInfo.setRecipient(orderInfoVo.getRecipient());
		orderInfo.setStatus(orderInfoVo.getStatus());
		orderInfo.setTotal(orderInfoVo.getTotal());
		orderInfo.setUserId(orderInfoVo.getUserId());
		return orderInfo;
	}

	public static List<OrderInfoVo> OrderInfoListToOrderInfoVoList(List<OrderInfo> orderInfoList){
		List<OrderInfoVo> orderInfoVoList = new ArrayList<>();
		for(OrderInfo item : orderInfoList){
			OrderInfoVo orderInfoVo = new OrderInfoVo();
			orderInfoVo.setGoods(item.getGoods());
			orderInfoVo.setTotal(item.getTotal());
			orderInfoVo.setId(item.getId());
			orderInfoVo.setUserId(item.getUserId());
			orderInfoVo.setGoodsReceiveTime(item.getGoodsReceiveTime());
			orderInfoVoList.add(orderInfoVo);
		}
		return orderInfoVoList;
	}

}
