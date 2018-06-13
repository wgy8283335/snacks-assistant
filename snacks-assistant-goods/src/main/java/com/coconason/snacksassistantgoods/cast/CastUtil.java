package com.coconason.snacksassistantgoods.cast;

import com.coconason.snacksassistantcommon.vo.SnacksInfoVo;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;
import com.coconason.snacksassistantgoods.po.SnacksInfo;
import com.coconason.snacksassistantgoods.po.SnacksInventory;
import com.coconason.snacksassistantgoods.po.SnacksTypes;
import com.coconason.snacksassistantcommon.vo.SnacksTypesVo;

public class CastUtil {
	public static SnacksInfoVo SnacksInfoToSnacksInfoVo(SnacksInfo snacksInfo){
		SnacksInfoVo snacksInfoVo = new SnacksInfoVo();
		snacksInfoVo.setId(snacksInfo.getId());
		snacksInfoVo.setName(snacksInfo.getName());
		snacksInfoVo.setItemCost(snacksInfo.getItemCost());
		snacksInfoVo.setItemPrice(snacksInfo.getItemPrice());
		snacksInfoVo.setDes(snacksInfo.getDes());
		snacksInfoVo.setNutritionInformation(snacksInfo.getNutritionInformation());
		snacksInfoVo.setRecipe(snacksInfo.getRecipe());
		snacksInfoVo.setProducer(snacksInfo.getProducer());
		snacksInfoVo.setOwner(snacksInfo.getOwner());
		snacksInfoVo.setTrafficker(snacksInfo.getTrafficker());
		snacksInfoVo.setQuantity(snacksInfo.getQuantity());
		snacksInfoVo.setSnacksTypesId(snacksInfo.getSnacksTypesId());
		snacksInfoVo.setBatchsNum(snacksInfo.getBatchsNum());
		snacksInfoVo.setProduceDate(snacksInfo.getProduceDate());
		snacksInfoVo.setCode(snacksInfo.getCode());
		snacksInfoVo.setPicture(snacksInfo.getPicture());
		return snacksInfoVo;
	}
	public static SnacksInfo SnacksInfoVoToSnacksInfo(SnacksInfoVo snacksInfoVo){
		SnacksInfo snacksInfo = new SnacksInfo();
		snacksInfo.setId(snacksInfoVo.getId());
		snacksInfo.setName(snacksInfoVo.getName());
		snacksInfo.setItemCost(snacksInfoVo.getItemCost());
		snacksInfo.setItemPrice(snacksInfoVo.getItemPrice());
		snacksInfo.setDes(snacksInfoVo.getDes());
		snacksInfo.setNutritionInformation(snacksInfoVo.getNutritionInformation());
		snacksInfo.setRecipe(snacksInfoVo.getRecipe());
		snacksInfo.setProducer(snacksInfoVo.getProducer());
		snacksInfo.setOwner(snacksInfoVo.getOwner());
		snacksInfo.setTrafficker(snacksInfoVo.getTrafficker());
		snacksInfo.setQuantity(snacksInfoVo.getQuantity());
		snacksInfo.setSnacksTypesId(snacksInfoVo.getSnacksTypesId());
		snacksInfo.setBatchsNum(snacksInfoVo.getBatchsNum());
		snacksInfo.setProduceDate(snacksInfoVo.getProduceDate());
		snacksInfo.setCode(snacksInfoVo.getCode());
		snacksInfo.setPicture(snacksInfoVo.getPicture());
		return snacksInfo;
	}
	public static SnacksInventoryVo SnacksInventoryToSnacksInventoryVo(SnacksInventory snacksInventory){
		SnacksInventoryVo snacksInventoryVo = new SnacksInventoryVo();
		snacksInventoryVo.setId(snacksInventory.getId());
		snacksInventoryVo.setSnacksInfoId(snacksInventory.getSnacksInfoId());
		snacksInventoryVo.setQuantity(snacksInventory.getQuantity());
		snacksInventoryVo.setReceiveTime(snacksInventory.getReceiveTime());
		return snacksInventoryVo;
	}
	public static SnacksInventory SnacksInventoryVoToSnacksInventory(SnacksInventoryVo snacksInventoryVo){
		SnacksInventory snacksInventory = new SnacksInventory();
		snacksInventory.setId(snacksInventoryVo.getId());
		snacksInventory.setSnacksInfoId(snacksInventoryVo.getSnacksInfoId());
		snacksInventory.setQuantity(snacksInventoryVo.getQuantity());
		snacksInventory.setReceiveTime(snacksInventoryVo.getReceiveTime());
		return snacksInventory;
	}
	public static SnacksTypesVo SnacksTypesToSnacksTypesVo(SnacksTypes snacksTypes){
		SnacksTypesVo snacksTypesVo = new SnacksTypesVo();
	        snacksTypesVo.setId(snacksTypes.getId());
		        snacksTypesVo.setName(snacksTypes.getName());
		        snacksTypesVo.setDes(snacksTypes.getDes());
		        snacksTypesVo.setTypeFirstLevel(snacksTypes.getTypeFirstLevel());
		        snacksTypesVo.setTypeSecondLevel(snacksTypes.getTypeSecondLevel());
		        snacksTypesVo.setTypeThirdLevel(snacksTypes.getTypeThirdLevel());
		        snacksTypesVo.setTypeForthLevel(snacksTypes.getTypeForthLevel());
		        snacksTypesVo.setTypeFifthLevel(snacksTypes.getTypeFifthLevel());
					return snacksTypesVo;
	}
	public static SnacksTypes SnacksTypesVoToSnacksTypes(SnacksTypesVo snacksTypesVo){
		SnacksTypes snacksTypes = new SnacksTypes();
	        snacksTypes.setId(snacksTypesVo.getId());
		        snacksTypes.setName(snacksTypesVo.getName());
		        snacksTypes.setDes(snacksTypesVo.getDes());
		        snacksTypes.setTypeFirstLevel(snacksTypesVo.getTypeFirstLevel());
		        snacksTypes.setTypeSecondLevel(snacksTypesVo.getTypeSecondLevel());
		        snacksTypes.setTypeThirdLevel(snacksTypesVo.getTypeThirdLevel());
		        snacksTypes.setTypeForthLevel(snacksTypesVo.getTypeForthLevel());
		        snacksTypes.setTypeFifthLevel(snacksTypesVo.getTypeFifthLevel());
					return snacksTypes;
	}
}