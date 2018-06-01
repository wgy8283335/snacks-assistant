package com.coconason.snacksassistantcommon.vo;

import java.io.Serializable;

public class AddressInfoVo implements Serializable {

	private static final long serialVersionUID = 1L;

	        // 主键
        private Long id;
		        // 
        private String postalCode;
		        // 
        private String nationalCode;
		        // 
        private String provinceName;
		        // 
        private String cityName;
		        // 
        private String countyName;
		        // 
        private String detailInfo;
		        // 
        private Long userInfoId;
				
	        public void setId(Long id){
            this.id = id;
        }
        public Long getId(){
            return this.id;
        }
		        public void setPostalCode(String postalCode){
            this.postalCode = postalCode;
        }
        public String getPostalCode(){
            return this.postalCode;
        }
		        public void setNationalCode(String nationalCode){
            this.nationalCode = nationalCode;
        }
        public String getNationalCode(){
            return this.nationalCode;
        }
		        public void setProvinceName(String provinceName){
            this.provinceName = provinceName;
        }
        public String getProvinceName(){
            return this.provinceName;
        }
		        public void setCityName(String cityName){
            this.cityName = cityName;
        }
        public String getCityName(){
            return this.cityName;
        }
		        public void setCountyName(String countyName){
            this.countyName = countyName;
        }
        public String getCountyName(){
            return this.countyName;
        }
		        public void setDetailInfo(String detailInfo){
            this.detailInfo = detailInfo;
        }
        public String getDetailInfo(){
            return this.detailInfo;
        }
		        public void setUserInfoId(Long userInfoId){
            this.userInfoId = userInfoId;
        }
        public Long getUserInfoId(){
            return this.userInfoId;
        }
				}