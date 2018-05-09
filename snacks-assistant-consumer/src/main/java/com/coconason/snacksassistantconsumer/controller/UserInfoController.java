package com.coconason.snacksassistantconsumer.controller;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantconsumer.service.IUserInfoService;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@Configuration
public class UserInfoController {

    @Autowired
    IUserInfoService userInfoService;
    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(UserInfoController.class);

    @ApiOperation(value="Query the information of the user", notes="")
    @RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET)
    public SnacksResult getUserInfoVo(@PathVariable Long id){
        try{
            SnacksResult snacksResult = userInfoService.getUserInfoVo(id);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Modify the information of the user", notes="")
    @RequestMapping(value="/set_user_info",method = RequestMethod.POST)
    public SnacksResult setUserInfoVo(@RequestBody UserInfoVo userInfoVo){
        try{

            SnacksResult snacksResult = userInfoService.setUserInfoVo(userInfoVo);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

/*
    //查看从eureka获得的服务列表
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
    //从配置文件中读取meta的部分设置的参数
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
*/
    //手动设置数据库连接状态，用于模仿数据库链接不通的情况。
    //LocalHealthCheckHandler将Eureka上的应用状态改为相应状态。
    public static boolean canVisitDb = true;
//    @RequestMapping(value = "/db/{can}", method = RequestMethod.GET)
//    public void setDb(@PathVariable boolean can) {
//        canVisitDb = can;
//    }
}
