package com.coconason.snacksassistantcommon.vo;

import java.io.Serializable;

public class SnacksTypesVo implements Serializable {

	private static final long serialVersionUID = 1L;

	        // 主键ID
        private Long id;
		        // 种类名字
        private String name;
		        // 种类的描述
        private String des;
		        // 大类
        private String typeFirstLevel;
		        // 中类别
        private String typeSecondLevel;
		        // 小类
        private String typeThirdLevel;
		        // 小小类
        private String typeForthLevel;
		        // 确切味道的商品，用于区分同种商品更新换代后的差异
        private String typeFifthLevel;
				
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
		        public void setDes(String des){
            this.des = des;
        }
        public String getDes(){
            return this.des;
        }
		        public void setTypeFirstLevel(String typeFirstLevel){
            this.typeFirstLevel = typeFirstLevel;
        }
        public String getTypeFirstLevel(){
            return this.typeFirstLevel;
        }
		        public void setTypeSecondLevel(String typeSecondLevel){
            this.typeSecondLevel = typeSecondLevel;
        }
        public String getTypeSecondLevel(){
            return this.typeSecondLevel;
        }
		        public void setTypeThirdLevel(String typeThirdLevel){
            this.typeThirdLevel = typeThirdLevel;
        }
        public String getTypeThirdLevel(){
            return this.typeThirdLevel;
        }
		        public void setTypeForthLevel(String typeForthLevel){
            this.typeForthLevel = typeForthLevel;
        }
        public String getTypeForthLevel(){
            return this.typeForthLevel;
        }
		        public void setTypeFifthLevel(String typeFifthLevel){
            this.typeFifthLevel = typeFifthLevel;
        }
        public String getTypeFifthLevel(){
            return this.typeFifthLevel;
        }
				}