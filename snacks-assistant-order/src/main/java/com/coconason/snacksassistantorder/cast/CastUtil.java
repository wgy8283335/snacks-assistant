package com.coconason.snacksassistantorder.cast;

import com.alibaba.fastjson.JSONArray;
import com.coconason.snacksassistantcommon.vo.OrderInfoVo;
import com.coconason.snacksassistantorder.po.OrderInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CastUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static OrderInfoVo OrderInfoToOrderInfoVo(OrderInfo orderInfo){
		OrderInfoVo orderInfoVo = new OrderInfoVo();
		orderInfoVo.setAddress(orderInfo.getAddress());
		orderInfoVo.setAmount(orderInfo.getAmount());
		orderInfoVo.setDeduction(orderInfo.getDeduction());
		orderInfoVo.setDiscount(orderInfo.getDiscount());
		orderInfoVo.setGoods(JSONArray.parseArray(orderInfo.getGoods()));
		orderInfoVo.setId(String.valueOf(orderInfo.getId()));
		orderInfoVo.setPhoneNumber(orderInfo.getPhoneNumber());
		orderInfoVo.setReceptionTimeLowerLimit(orderInfo.getReceptionTimeLowerLimit());
		orderInfoVo.setReceptionTimeUpperLimit(orderInfo.getReceptionTimeUpperLimit());
		orderInfoVo.setGoodsReceiveTime(sdf.format(orderInfo.getGoodsReceiveTime()));
		orderInfoVo.setGoodsSendTime(sdf.format(orderInfo.getGoodsSendTime()));
		orderInfoVo.setRecipient(orderInfo.getRecipient());
		switch (orderInfo.getStatus()){
			case 0 : orderInfoVo.setStatus("未完成");break;
			case 1 : orderInfoVo.setStatus("已扣减库存");break;
			case 2 : orderInfoVo.setStatus("已送出");break;
			case 3 : orderInfoVo.setStatus("已收货");break;
			case 4 : orderInfoVo.setStatus("已支付");break;
		}
		orderInfoVo.setTotal(orderInfo.getTotal());
		orderInfoVo.setUserId(String.valueOf(orderInfo.getUserId()));
		return orderInfoVo;
	}	
	public static OrderInfo OrderInfoVoToOrderInfo(OrderInfoVo orderInfoVo) throws Exception{
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setAddress(orderInfoVo.getAddress());
		orderInfo.setAmount(orderInfoVo.getAmount());
		orderInfo.setDeduction(orderInfoVo.getDeduction());
		orderInfo.setDiscount(orderInfoVo.getDiscount());
		orderInfo.setGoods(JSONArray.toJSONString(orderInfoVo.getGoods()));
		orderInfo.setId(Long.parseLong(orderInfoVo.getId()));
		orderInfo.setPhoneNumber(orderInfoVo.getPhoneNumber());
		orderInfo.setReceptionTimeLowerLimit(orderInfoVo.getReceptionTimeLowerLimit());
		orderInfo.setReceptionTimeUpperLimit(orderInfoVo.getReceptionTimeUpperLimit());
		orderInfo.setGoodsReceiveTime(sdf.parse(orderInfoVo.getGoodsReceiveTime()));
		orderInfo.setGoodsSendTime(sdf.parse(orderInfoVo.getGoodsSendTime()));
		orderInfo.setRecipient(orderInfoVo.getRecipient());
		switch (orderInfoVo.getStatus()){
			case "未完成" : orderInfo.setStatus((byte)0);break;
			case "已扣减库存" : orderInfo.setStatus((byte)1);break;
			case "已送出" : orderInfo.setStatus((byte)2);break;
			case "已收货" : orderInfo.setStatus((byte)3);break;
			case "已支付" : orderInfo.setStatus((byte)4);break;
		}
		orderInfo.setTotal(orderInfoVo.getTotal());
		orderInfo.setUserId(Long.parseLong(orderInfoVo.getUserId()));
		return orderInfo;
	}

	public static List<OrderInfoVo> OrderInfoListToOrderInfoVoList(List<OrderInfo> orderInfoList){
		List<OrderInfoVo> orderInfoVoList = new ArrayList<>();
		for(OrderInfo item : orderInfoList){
			OrderInfoVo orderInfoVo = new OrderInfoVo();
			orderInfoVo.setGoods(JSONArray.parseArray(item.getGoods()));
			orderInfoVo.setTotal(item.getTotal());
			orderInfoVo.setId(String.valueOf(item.getId()));
			orderInfoVo.setUserId(String.valueOf(item.getUserId()));
			orderInfoVo.setGoodsReceiveTime(sdf.format(item.getGoodsReceiveTime()));
			orderInfoVoList.add(orderInfoVo);
		}
		return orderInfoVoList;
	}

}
