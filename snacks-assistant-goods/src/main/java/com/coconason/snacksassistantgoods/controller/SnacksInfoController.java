package com.coconason.snacksassistantgoods.controller;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.service.ISnacksInfoService;
import com.coconason.snacksassistantgoods.vo.SnacksInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SnacksInfoController {

    @Autowired
    ISnacksInfoService snacksInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(SnacksInfoController.class);

    @ApiOperation(value="Add the information of the snacks", notes="")
    @RequestMapping(value="/add_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addSnacksInfoVo(@RequestBody @Valid SnacksInfoVo snacksInfoVo, BindingResult result){
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try{
            SnacksResult snacksResult = snacksInfoService.addSnacksInfoVo(snacksInfoVo);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Delete the information of the snacks", notes="")
    @RequestMapping(value="/delete_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteSnacksInfoVo(@RequestParam Long id){
        try{
            SnacksResult snacksResult = snacksInfoService.deleteSnacksInfoVo(id);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Modify the information of the snacks", notes="")
    @RequestMapping(value="/set_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setUserInfoVo(@RequestBody@Valid SnacksInfoVo snacksInfoVo, BindingResult result) {
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try {
            SnacksResult snacksResult = snacksInfoService.setSnacksInfoVo(snacksInfoVo);
            return snacksResult;
        }catch (Exception exception) {
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(), ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Query the information of the snacks", notes="")
    @RequestMapping(value="/get_snacks_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getUserInfoVo(@PathVariable Long id){
        try{
            SnacksInfoVo snacksInfoVo = snacksInfoService.getSnacksInfoVo(id);
            return SnacksResult.ok(snacksInfoVo);
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
}
