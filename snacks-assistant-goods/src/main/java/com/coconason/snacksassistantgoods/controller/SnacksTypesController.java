package com.coconason.snacksassistantgoods.controller;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.service.ISnacksTypesService;
import com.coconason.snacksassistantgoods.vo.SnacksTypesVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SnacksTypesController {

    @Autowired
    ISnacksTypesService snacksTypesService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(SnacksTypesController.class);

    @ApiOperation(value="Add the types of the snacks", notes="")
    @RequestMapping(value="/add_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addSnacksTypesVo(@RequestBody @Valid SnacksTypesVo snacksTypesVo, BindingResult result){
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try{
            SnacksResult snacksResult = snacksTypesService.addSnacksTypesVo(snacksTypesVo);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Delete the types of the snacks", notes="")
    @RequestMapping(value="/delete_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteSnacksTypesVo(@RequestParam Long id){
        try{
            SnacksResult snacksResult = snacksTypesService.deleteSnacksTypesVo(id);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Modify the types of the snacks", notes="")
    @RequestMapping(value="/set_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setUserTypesVo(@RequestBody@Valid SnacksTypesVo snacksTypesVo, BindingResult result) {
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try {
            SnacksResult snacksResult = snacksTypesService.setSnacksTypesVo(snacksTypesVo);
            return snacksResult;
        }catch (Exception exception) {
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(), ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Query the types of the snacks", notes="")
    @RequestMapping(value="/get_snacks_types/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getUserTypesVo(@PathVariable Long id){
        try{
            SnacksTypesVo snacksTypesVo = snacksTypesService.getSnacksTypesVo(id);
            return SnacksResult.ok(snacksTypesVo);
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
}
