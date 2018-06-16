package com.coconason.snacksassistantgoods;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.coconason.snacksassistantgoods.service.ISnacksInventoryService;
import com.coconason.snacksassistantgoods.service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableBinding(ReceiveService.class)
public class SnacksAssistantGoodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnacksAssistantGoodsApplication.class, args);
	}

	@Autowired
	ISnacksInventoryService snacksInventoryService;

	@StreamListener("inventoryDeduction")
	public void onReceiveInventoryDeduction(byte[] msg){
		String inventoryGoods = new String(msg);
		System.out.println("接受到的消息："+ inventoryGoods);
		JSONArray inventoryGoodsArray = JSONArray.parseArray(inventoryGoods);
		try{
			snacksInventoryService.deleteQuantitySnacksInventory(inventoryGoodsArray);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
