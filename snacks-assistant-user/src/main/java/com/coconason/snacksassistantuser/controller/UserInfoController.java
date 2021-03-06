package com.coconason.snacksassistantuser.controller;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.coconason.snacksassistantuser.service.IUserInfoService;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Null;
import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    IUserInfoService userInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(UserInfoController.class);

    @ApiOperation(value="Add the information of the user", notes="")
    @RequestMapping(value="/add_user_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addUserInfoVo(@RequestBody @Validated UserInfoVo userInfoVo) throws Exception{
        SnacksResult snacksResult = userInfoService.addUserInfoVo(userInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the user", notes="")
    @RequestMapping(value="/delete_user_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteUserInfoVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = userInfoService.deleteUserInfoVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the user", notes="")
    @RequestMapping(value="/set_user_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setUserInfoVo(@RequestBody @Validated UserInfoVo userInfoVo) throws Exception{
        LOG.info("Controller");
        SnacksResult snacksResult = userInfoService.setUserInfoVo(userInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the user", notes="")
    @RequestMapping(value="/get_user_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getUserInfoVo(@PathVariable @Null Long id) throws Exception{
        UserInfoVo userInfoVo = userInfoService.getUserInfoVo(id);
        return new SnacksResult<UserInfoVo>().ok(userInfoVo);
    }
    @ApiOperation(value="Query the information of the users", notes="")
    @RequestMapping(value="/get_user_info_list",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getUserInfoVo(@RequestBody @Validated UserInfoVo userInfoVo) throws Exception{
        List<UserInfoVo> userInfoVoList = userInfoService.getUserInfoVoList(userInfoVo);
        return new SnacksResult<List<UserInfoVo>>().ok(userInfoVoList);
    }
}
