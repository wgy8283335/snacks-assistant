package com.coconason.snacksassistantcommon.vo;

import java.io.Serializable;
import java.util.Date;

public class SnacksInfoVo implements Serializable {

	private static final long serialVersionUID = 1L;

	        // 
        private Long id;
		        // 商品名字
        private String name;
		        // 单品成本
        private Integer itemCost;
		        // 单品价格
        private Integer itemPrice;
		        // 商品描述
        private String des;
		        // 
        private String nutritionInformation;
		        // 
        private String recipe;
		        // 生产厂家
        private String producer;
		        // 商品所属公司
        private String owner;
		        // 贸易商
        private String trafficker;
		        // 数量\库存量
        private Integer quantity;
		        // 所属类型
        private Long snacksTypesId;
		        // 生产批次
        private Integer batchsNum;
		        // 生产日期
        private Date produceDate;
		        // 条形码
        private String code;
		        // 零食图片链接
        private String picture;
				
	        public void setId(Long id){
            this.id = id;
        }
        public Long getId(){
            return this.id;
        }
		        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
		        public void setItemCost(Integer itemCost){
            this.itemCost = itemCost;
        }
        public Integer getItemCost(){
            return this.itemCost;
        }
		        public void setItemPrice(Integer itemPrice){
            this.itemPrice = itemPrice;
        }
        public Integer getItemPrice(){
            return this.itemPrice;
        }
		        public void setDes(String des){
            this.des = des;
        }
        public String getDes(){
            return this.des;
        }
		        public void setNutritionInformation(String nutritionInformation){
            this.nutritionInformation = nutritionInformation;
        }
        public String getNutritionInformation(){
            return this.nutritionInformation;
        }
		        public void setRecipe(String recipe){
            this.recipe = recipe;
        }
        public String getRecipe(){
            return this.recipe;
        }
		        public void setProducer(String producer){
            this.producer = producer;
        }
        public String getProducer(){
            return this.producer;
        }
		        public void setOwner(String owner){
            this.owner = owner;
        }
        public String getOwner(){
            return this.owner;
        }
		        public void setTrafficker(String trafficker){
            this.trafficker = trafficker;
        }
        public String getTrafficker(){
            return this.trafficker;
        }
		        public void setQuantity(Integer quantity){
            this.quantity = quantity;
        }
        public Integer getQuantity(){
            return this.quantity;
        }
		        public void setSnacksTypesId(Long snacksTypesId){
            this.snacksTypesId = snacksTypesId;
        }
        public Long getSnacksTypesId(){
            return this.snacksTypesId;
        }
		        public void setBatchsNum(Integer batchsNum){
            this.batchsNum = batchsNum;
        }
        public Integer getBatchsNum(){
            return this.batchsNum;
        }
		        public void setProduceDate(Date produceDate){
            this.produceDate = produceDate;
        }
        public Date getProduceDate(){
            return this.produceDate;
        }
		        public void setCode(String code){
            this.code = code;
        }
        public String getCode(){
            return this.code;
        }
		        public void setPicture(String picture){
            this.picture = picture;
        }
        public String getPicture(){
            return this.picture;
        }
				}