package com.coconason.snacksassistantgoods.controller;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.service.ISnacksInfoService;
import com.coconason.snacksassistantcommon.vo.SnacksInfoVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Null;

@RestController
public class SnacksInfoController {

    @Autowired
    ISnacksInfoService snacksInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(SnacksInfoController.class);

    @ApiOperation(value="Add the information of the snacks_info", notes="")
    @RequestMapping(value="/add_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addSnacksInfoVo(@RequestBody @Validated SnacksInfoVo snacksInfoVo) throws Exception{
        SnacksResult snacksResult = snacksInfoService.addSnacksInfoVo(snacksInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the snacks_info", notes="")
    @RequestMapping(value="/delete_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteSnacksInfoVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = snacksInfoService.deleteSnacksInfoVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the snacks_info", notes="")
    @RequestMapping(value="/set_snacks_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setSnacksInfoVo(@RequestBody @Validated SnacksInfoVo snacksInfoVo) throws Exception{
        SnacksResult snacksResult = snacksInfoService.setSnacksInfoVo(snacksInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the snacks_info", notes="")
    @RequestMapping(value="/get_snacks_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getSnacksInfoVo(@PathVariable @Null Long id) throws Exception{
        SnacksInfoVo snacksInfoVo = snacksInfoService.getSnacksInfoVo(id);
        return new SnacksResult().ok(snacksInfoVo);
    }
}
