package com.coconason.snacksassistantorder.controller;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantorder.service.IOrderInfoService;
import com.coconason.snacksassistantorder.vo.OrderInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OrderInfoController {

    @Autowired
    IOrderInfoService orderInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(OrderInfoController.class);

    @ApiOperation(value="Add the information of the order", notes="")
    @RequestMapping(value="/add_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addOrderInfoVo(@RequestBody @Valid OrderInfoVo orderInfoVo, BindingResult result){
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try{
            SnacksResult snacksResult = orderInfoService.addOrderInfoVo(orderInfoVo);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Delete the information of the order", notes="")
    @RequestMapping(value="/delete_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteOrderInfoVo(@RequestParam Long id){
        try{
            SnacksResult snacksResult = orderInfoService.deleteOrderInfoVo(id);
            return snacksResult;
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Modify the information of the order", notes="")
    @RequestMapping(value="/set_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setOrderInfoVo(@RequestBody@Valid OrderInfoVo orderInfoVo,BindingResult result) {
        if(result.hasErrors()){
            return SnacksResult.build(ErrorCode.PARAM_ERROR.value(),ErrorCode.PARAM_ERROR.msg());
        }
        try {
            SnacksResult snacksResult = orderInfoService.setOrderInfoVo(orderInfoVo);
            return snacksResult;
        }catch (Exception exception) {
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(), ErrorCode.SYS_ERROR.msg());
        }
    }

    @ApiOperation(value="Query the information of the order", notes="")
    @RequestMapping(value="/get_order_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getOrderInfoVo(@PathVariable Long id){
        try{
            OrderInfoVo orderInfoVo = orderInfoService.getOrderInfoVo(id);
            return SnacksResult.ok(orderInfoVo);
        }catch (Exception exception){
            return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
}
