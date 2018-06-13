package com.coconason.snacksassistantgoods.controller;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.service.ISnacksInventoryService;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Null;

@RestController
public class SnacksInventoryController {

    @Autowired
    ISnacksInventoryService snacksInventoryService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(SnacksInventoryController.class);

    @ApiOperation(value="Add the information of the snacks_inventory", notes="")
    @RequestMapping(value="/add_snacks_inventory",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addSnacksInventoryVo(@RequestBody @Validated SnacksInventoryVo snacksInventoryVo) throws Exception{
        SnacksResult snacksResult = snacksInventoryService.addSnacksInventoryVo(snacksInventoryVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the snacks_inventory", notes="")
    @RequestMapping(value="/delete_snacks_inventory",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteSnacksInventoryVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = snacksInventoryService.deleteSnacksInventoryVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the snacks_inventory", notes="")
    @RequestMapping(value="/set_snacks_inventory",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setSnacksInventoryVo(@RequestBody @Validated SnacksInventoryVo snacksInventoryVo) throws Exception{
        SnacksResult snacksResult = snacksInventoryService.setSnacksInventoryVo(snacksInventoryVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the snacks_inventory", notes="")
    @RequestMapping(value="/get_snacks_inventory/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getSnacksInventoryVo(@PathVariable @Null Long id) throws Exception{
        SnacksInventoryVo snacksInventoryVo = snacksInventoryService.getSnacksInventoryVo(id);
        return new SnacksResult().ok(snacksInventoryVo);
    }
}
