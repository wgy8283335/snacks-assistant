package com.coconason.snacksassistantuser.cast;

import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.coconason.snacksassistantuser.po.AddressInfo;
import com.coconason.snacksassistantuser.po.UserInfo;
import com.coconason.snacksassistantcommon.vo.AddressInfoVo;
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
	public static AddressInfoVo AddressInfoToAddressInfoVo(AddressInfo addressInfo){
		AddressInfoVo addressInfoVo = new AddressInfoVo();
		addressInfoVo.setId(addressInfo.getId());
		addressInfoVo.setPostalCode(addressInfo.getPostalCode());
		addressInfoVo.setNationalCode(addressInfo.getNationalCode());
		addressInfoVo.setProvinceName(addressInfo.getProvinceName());
		addressInfoVo.setCityName(addressInfo.getCityName());
		addressInfoVo.setCountyName(addressInfo.getCountyName());
		addressInfoVo.setDetailInfo(addressInfo.getDetailInfo());
		addressInfoVo.setUserInfoId(addressInfo.getUserInfoId());
		return addressInfoVo;
	}
	public static AddressInfo AddressInfoVoToAddressInfo(AddressInfoVo addressInfoVo){
		AddressInfo addressInfo = new AddressInfo();
		addressInfo.setId(addressInfoVo.getId());
		addressInfo.setPostalCode(addressInfoVo.getPostalCode());
		addressInfo.setNationalCode(addressInfoVo.getNationalCode());
		addressInfo.setProvinceName(addressInfoVo.getProvinceName());
		addressInfo.setCityName(addressInfoVo.getCityName());
		addressInfo.setCountyName(addressInfoVo.getCountyName());
		addressInfo.setDetailInfo(addressInfoVo.getDetailInfo());
		addressInfo.setUserInfoId(addressInfoVo.getUserInfoId());
		return addressInfo;
	}
	public static List<AddressInfoVo> AddressInfoListToAddressInfoVoList(List<AddressInfo> addressInfoList) {
		List<AddressInfoVo> addressInfoVoList = new ArrayList();
		for (AddressInfo addressInfo : addressInfoList) {
			addressInfoVoList.add(AddressInfoToAddressInfoVo(addressInfo));
		}
		return addressInfoVoList;
	}
}
