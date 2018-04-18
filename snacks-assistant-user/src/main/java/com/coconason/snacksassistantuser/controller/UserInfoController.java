package com.coconason.snacksassistantuser.controller;


import com.coconason.snacksassistantuser.constant.ErrorCode;
import com.coconason.snacksassistantuser.model.SnacksResult;
import com.coconason.snacksassistantuser.service.IUserInfoService;
import com.coconason.snacksassistantuser.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @Autowired
    IUserInfoService userInfoService;

    @RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getUserInfoVo(@PathVariable Long id){
        try{
            UserInfoVo userInfoVo = userInfoService.getUserInfoVo(id);
            System.out.print("This is called");
            return SnacksResult.ok(userInfoVo);
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

    public static boolean canVisitDb = true;

    @RequestMapping(value = "/db/{can}", method = RequestMethod.GET)
    public void setDb(@PathVariable boolean can) {
        canVisitDb = can;
    }
}
