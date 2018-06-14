package com.coconason.snacksassistantorder.controller;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantorder.service.IOrderInfoService;
import com.coconason.snacksassistantcommon.vo.OrderInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Null;
import java.util.List;

@RestController
public class OrderInfoController {

    @Autowired
    IOrderInfoService orderInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(OrderInfoController.class);
    @ApiOperation(value="Add the information of the order", notes="")
    @RequestMapping(value="/add_order_info_wx",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addOrderInfoVo(@RequestBody @Validated OrderInfoVo orderInfoVo) throws Exception{
        SnacksResult snacksResult = orderInfoService.addOrderInfoVoWx(orderInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Add the information of the order", notes="")
    @RequestMapping(value="/add_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addOrderInfoVo(@RequestBody @Validated OrderInfoVo orderInfoVo) throws Exception{
        SnacksResult snacksResult = orderInfoService.addOrderInfoVo(orderInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the order", notes="")
    @RequestMapping(value="/delete_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteOrderInfoVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = orderInfoService.deleteOrderInfoVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the order", notes="")
    @RequestMapping(value="/set_order_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setOrderInfoVo(@RequestBody @Validated OrderInfoVo orderInfoVo) throws Exception{
        SnacksResult snacksResult = orderInfoService.setOrderInfoVo(orderInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the order", notes="")
    @RequestMapping(value="/get_order_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getOrderInfoVo(@PathVariable @Null Long id) throws Exception{
        OrderInfoVo orderInfoVo = orderInfoService.getOrderInfoVo(id);
        return new SnacksResult<OrderInfoVo>().ok(orderInfoVo);
    }

    @ApiOperation(value="Query the information of the order list", notes="")
    @RequestMapping(value="/get_order_info_list/{userId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getOrderInfoVoList(@PathVariable @Null Long userId) throws Exception{
        List<OrderInfoVo> orderInfoVoList = orderInfoService.getOrderInfoVoList(userId);
        return new SnacksResult<List<OrderInfoVo>>().ok(orderInfoVoList);
    }
}
