package com.coconason.snacksassistantcommon.vo;

import java.io.Serializable;
import java.util.Date;

public class SnacksInventoryVo implements Serializable {

	private static final long serialVersionUID = 1L;

	        // 
        private Long id;
		        // 
        private Long snacksInfoId;
		        // 
        private Integer quantity;
		        // 
        private Date receiveTime;
				
	        public void setId(Long id){
            this.id = id;
        }
        public Long getId(){
            return this.id;
        }
		        public void setSnacksInfoId(Long snacksInfoId){
            this.snacksInfoId = snacksInfoId;
        }
        public Long getSnacksInfoId(){
            return this.snacksInfoId;
        }
		        public void setQuantity(Integer quantity){
            this.quantity = quantity;
        }
        public Integer getQuantity(){
            return this.quantity;
        }
		        public void setReceiveTime(Date receiveTime){
            this.receiveTime = receiveTime;
        }
        public Date getReceiveTime(){
            return this.receiveTime;
        }
				}