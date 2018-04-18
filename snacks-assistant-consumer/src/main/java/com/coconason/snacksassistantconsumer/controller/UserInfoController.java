package com.coconason.snacksassistantconsumer.controller;

import com.coconason.snacksassistantconsumer.constant.ErrorCode;
import com.coconason.snacksassistantconsumer.model.SnacksResult;
import com.coconason.snacksassistantconsumer.service.IUserInfoService;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Configuration
public class UserInfoController {

    @Autowired
    IUserInfoService userInfoService;

    @RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET)
    public SnacksResult getUserInfoVo(@PathVariable Long id){
        try{
            SnacksResult snacksResult = userInfoService.getUserInfoVo(id);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @RequestMapping(value="/set_user_info",method = RequestMethod.POST)
    public SnacksResult setUserInfoVo(@RequestBody UserInfoVo userInfoVo){
        try{
            SnacksResult snacksResult = userInfoService.setUserInfoVo(userInfoVo);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/list")
    @ResponseBody
    public String serviceCount() {
        List<String> names = discoveryClient.getServices();
        for(String serviceId : names) {
            List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
            System.out.println(serviceId + ": " + instances.size());
        }
        return "";
    }
    @GetMapping("/meta")
    @ResponseBody
    public String getMetadata() {
        List<ServiceInstance> instances = discoveryClient.getInstances("snacks-assistant-user");
        for(ServiceInstance ins : instances) {
            String name = ins.getMetadata().get("company-name");
            System.out.println(ins.getPort() + "---" + name);
        }
        return "";
    }
}
