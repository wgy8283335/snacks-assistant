package com.coconason.snacksassistantconsumer.service.impl;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantconsumer.clinets.SnacksAssistantUserClient;
import com.coconason.snacksassistantconsumer.service.IUserInfoService;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements IUserInfoService{

    @Autowired
    SnacksAssistantUserClient snacksAssistantUserClient;

    @Override
//    @CacheResult(cacheKeyMethod = "getCacheKey") //只在查询方法上缓存结果
    @CacheResult
    @HystrixCommand
    public SnacksResult getUserInfoVo(Long id) throws Exception{
        SnacksResult<UserInfoVo> snacksResult = snacksAssistantUserClient.getUserInfoVo(id);
        return snacksResult;
    }
//    public String getCacheKey(Long id){
//        return String.valueOf(id);
//    }
    @Override
    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo) throws Exception{
        return null;
    }
    @HystrixCommand
    @Override
    public SnacksResult getUserInfoVoList(UserInfoVo userInfoVo) throws Exception {
        SnacksResult<List<UserInfoVo>> snacksResult = snacksAssistantUserClient.getUserInfoVoList(userInfoVo);
        return snacksResult;
    }
    //    @Bean
//    @LoadBalanced//提供负载均衡的功能，具体实现是通过拦截器实现的
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
//
//    @Override
//    public UserInfoVo getUserInfoVo(Long id) throws Exception{
//        RestTemplate restTemplate = getRestTemplate();
//        HashMap map = new HashMap<String,Long>();
//        map.put("id",id);
//        String snacksResultString = restTemplate.getForObject("http://snacks-assistant-user/get_user_info/{id}", String.class ,map);
//        SnacksResult snacksResult = SnacksResult.formatToPojo(snacksResultString,UserInfoVo.class);
//        UserInfoVo userInfoVo= (UserInfoVo)snacksResult.getDatum();
//        return userInfoVo;
//    }
}
