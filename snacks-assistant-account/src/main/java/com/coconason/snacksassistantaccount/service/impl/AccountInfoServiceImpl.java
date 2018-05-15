package com.coconason.snacksassistantaccount.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.coconason.snacksassistantaccount.service.IAccountInfoService;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
public class AccountInfoServiceImpl implements IAccountInfoService {

    @Override
    @HystrixCommand
    public SnacksResult loginAccount(String code) throws Exception {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("appid","wxa323c20698a3695d");
        map.put("secret","e148f6e9df0951aa9002eb3815fca555");
        map.put("js_code",code);
        map.put("grant_type","authorization_code");
        RestTemplate restTemplate = new RestTemplate();
        JSONObject resultMap = restTemplate.getForObject("https://api.weixin.qq.com/sns/jscode2session", JSONObject.class,map);
        //将resultMap中的openid和session_key存储在redis中,对于首次登陆的用户要将openid和unionid存储在数据库中
        if(resultMap.containsKey("openid")){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build((Integer)resultMap.get("errcode"),(String) resultMap.get("errmsg"));
        }

    }
}
