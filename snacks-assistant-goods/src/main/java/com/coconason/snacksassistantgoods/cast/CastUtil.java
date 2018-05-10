package com.coconason.snacksassistantgoods.cast;

import com.coconason.snacksassistantgoods.po.SnacksInfo;
import com.coconason.snacksassistantgoods.po.SnacksTypes;
import com.coconason.snacksassistantgoods.vo.SnacksInfoVo;
import com.coconason.snacksassistantgoods.vo.SnacksTypesVo;


public class CastUtil {

	public static SnacksInfoVo SnacksInfoToSnacksInfoVo(SnacksInfo snacksInfo){
		SnacksInfoVo snacksInfoVo = new SnacksInfoVo();
		snacksInfoVo.setBatchsNum(snacksInfo.getBatchsNum());
		snacksInfoVo.setCode(snacksInfo.getCode());
		snacksInfoVo.setDes(snacksInfo.getCode());
		snacksInfoVo.setId(snacksInfo.getId());
		snacksInfoVo.setName(snacksInfo.getName());
		snacksInfoVo.setNutritionInformation(snacksInfo.getNutritionInformation());
		snacksInfoVo.setOwner(snacksInfo.getOwner());
		snacksInfoVo.setPicture(snacksInfo.getPicture());
		snacksInfoVo.setProduceDate(snacksInfo.getProduceDate());
		snacksInfoVo.setProducer(snacksInfo.getProducer());
		snacksInfoVo.setQuantity(snacksInfo.getQuantity());
		snacksInfoVo.setRecipe(snacksInfo.getRecipe());
		snacksInfoVo.setSnacksTypesId(snacksInfo.getSnacksTypesId());
		snacksInfoVo.setTrafficker(snacksInfo.getTrafficker());
		return snacksInfoVo;
	}	
	public static SnacksInfo SnacksInfoVoToSnacksInfo(SnacksInfoVo snacksInfoVo){
		SnacksInfo snacksInfo = new SnacksInfo();
		snacksInfo.setBatchsNum(snacksInfoVo.getBatchsNum());
		snacksInfo.setCode(snacksInfoVo.getCode());
		snacksInfo.setDes(snacksInfoVo.getCode());
		snacksInfo.setId(snacksInfoVo.getId());
		snacksInfo.setName(snacksInfoVo.getName());
		snacksInfo.setNutritionInformation(snacksInfoVo.getNutritionInformation());
		snacksInfo.setOwner(snacksInfoVo.getOwner());
		snacksInfo.setPicture(snacksInfoVo.getPicture());
		snacksInfo.setProduceDate(snacksInfoVo.getProduceDate());
		snacksInfo.setProducer(snacksInfoVo.getProducer());
		snacksInfo.setQuantity(snacksInfoVo.getQuantity());
		snacksInfo.setRecipe(snacksInfoVo.getRecipe());
		snacksInfo.setSnacksTypesId(snacksInfoVo.getSnacksTypesId());
		snacksInfo.setTrafficker(snacksInfoVo.getTrafficker());
		return snacksInfo;
	}
	public static SnacksTypesVo SnacksTypesToSnacksTypesVo(SnacksTypes SnacksTypes){
		SnacksTypesVo SnacksTypesVo = new SnacksTypesVo();
		SnacksTypesVo.setDes(SnacksTypes.getDes());
		SnacksTypesVo.setId(SnacksTypes.getId());
		SnacksTypesVo.setName(SnacksTypes.getName());
		SnacksTypesVo.setTypeFirstLevel(SnacksTypes.getTypeFirstLevel());
		SnacksTypesVo.setTypeSecondLevel(SnacksTypes.getTypeSecondLevel());
		SnacksTypesVo.setTypeThirdLevel(SnacksTypes.getTypeThirdLevel());
		SnacksTypesVo.setTypeForthLevel(SnacksTypes.getTypeForthLevel());
		SnacksTypesVo.setTypeFifthLevel(SnacksTypes.getTypeFifthLevel());
		return SnacksTypesVo;
	}
	public static SnacksTypes SnacksTypesVoToSnacksTypes(SnacksTypesVo SnacksTypesVo){
		SnacksTypes SnacksTypes = new SnacksTypes();
		SnacksTypes.setDes(SnacksTypesVo.getDes());
		SnacksTypes.setId(SnacksTypesVo.getId());
		SnacksTypes.setName(SnacksTypesVo.getName());
		SnacksTypes.setTypeFirstLevel(SnacksTypesVo.getTypeFirstLevel());
		SnacksTypes.setTypeSecondLevel(SnacksTypesVo.getTypeSecondLevel());
		SnacksTypes.setTypeThirdLevel(SnacksTypesVo.getTypeThirdLevel());
		SnacksTypes.setTypeForthLevel(SnacksTypesVo.getTypeForthLevel());
		SnacksTypes.setTypeFifthLevel(SnacksTypesVo.getTypeFifthLevel());
		return SnacksTypes;
	}
}
