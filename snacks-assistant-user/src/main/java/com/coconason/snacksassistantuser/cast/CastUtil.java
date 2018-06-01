package com.coconason.snacksassistantuser.cast;

import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.coconason.snacksassistantuser.po.UserInfo;

import java.util.ArrayList;
import java.util.List;


public class CastUtil {

	public static UserInfoVo UserInfoToUserInfoVo(UserInfo userInfo){
		UserInfoVo userInfoVo = new UserInfoVo();
		userInfoVo.setAccountId(userInfo.getAccountId());
		userInfoVo.setAddress(userInfo.getAddress());
		userInfoVo.setConsumptionLowerLimit(userInfo.getConsumptionLowerLimit());
		userInfoVo.setConsumptionUpperLimit(userInfo.getConsumptionUpperLimit());
		userInfoVo.setDeliveryCycle(userInfo.getDeliveryCycle());
		userInfoVo.setDislikeFoodIdList(userInfo.getDislikeFoodIdList());
		userInfoVo.setFavoriteFoodIdList(userInfo.getFavoriteFoodIdList());
		userInfoVo.setId(userInfo.getId());
		userInfoVo.setPhoneNumber(userInfo.getPhoneNumber());
		userInfoVo.setReceptionTimeLowerLimit(userInfo.getReceptionTimeLowerLimit());
		userInfoVo.setReceptionTimeUpperLimit(userInfo.getReceptionTimeUpperLimit());
		userInfoVo.setRecipient(userInfo.getRecipient());
		userInfoVo.setSubscriptionSate(userInfo.getSubscriptionSate());
		userInfoVo.setSubscriptionStartTime(userInfo.getSubscriptionStartTime());
		return userInfoVo;
	}	
	public static UserInfo UserInfoVoToUserInfo(UserInfoVo userInfoVo){
		UserInfo userInfo = new UserInfo();
		userInfo.setAccountId(userInfoVo.getAccountId());
		userInfo.setAddress(userInfoVo.getAddress());
		userInfo.setConsumptionLowerLimit(userInfoVo.getConsumptionLowerLimit());
		userInfo.setConsumptionUpperLimit(userInfoVo.getConsumptionUpperLimit());
		userInfo.setDeliveryCycle(userInfoVo.getDeliveryCycle());
		userInfo.setDislikeFoodIdList(userInfoVo.getDislikeFoodIdList());
		userInfo.setFavoriteFoodIdList(userInfoVo.getFavoriteFoodIdList());
		userInfo.setId(userInfoVo.getId());
		userInfo.setPhoneNumber(userInfoVo.getPhoneNumber());
		userInfo.setReceptionTimeLowerLimit(userInfoVo.getReceptionTimeLowerLimit());
		userInfo.setReceptionTimeUpperLimit(userInfoVo.getReceptionTimeUpperLimit());
		userInfo.setRecipient(userInfoVo.getRecipient());
		userInfo.setSubscriptionSate(userInfoVo.getSubscriptionSate());
		userInfo.setSubscriptionStartTime(userInfoVo.getSubscriptionStartTime());
		return userInfo;
	}
	public static List<UserInfoVo> UserInfoListToUserInfoVoList(List<UserInfo> userInfoList) {
		List<UserInfoVo> userInfoVoList = new ArrayList<UserInfoVo>();
		for (UserInfo userInfo : userInfoList) {
			userInfoVoList.add(UserInfoToUserInfoVo(userInfo));
		}
		return userInfoVoList;
	}
}
