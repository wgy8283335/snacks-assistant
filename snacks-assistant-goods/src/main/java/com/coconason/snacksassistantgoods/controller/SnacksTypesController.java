package com.coconason.snacksassistantgoods.controller;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.service.ISnacksTypesService;
import com.coconason.snacksassistantcommon.vo.SnacksTypesVo;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Null;

@RestController
public class SnacksTypesController {

    @Autowired
    ISnacksTypesService snacksTypesService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(SnacksTypesController.class);

    @ApiOperation(value="Add the information of the snacks_types", notes="")
    @RequestMapping(value="/add_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addSnacksTypesVo(@RequestBody @Validated SnacksTypesVo snacksTypesVo) throws Exception{
        SnacksResult snacksResult = snacksTypesService.addSnacksTypesVo(snacksTypesVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the snacks_types", notes="")
    @RequestMapping(value="/delete_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteSnacksTypesVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = snacksTypesService.deleteSnacksTypesVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the snacks_types", notes="")
    @RequestMapping(value="/set_snacks_types",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setSnacksTypesVo(@RequestBody @Validated SnacksTypesVo snacksTypesVo) throws Exception{
        SnacksResult snacksResult = snacksTypesService.setSnacksTypesVo(snacksTypesVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the snacks_types", notes="")
    @RequestMapping(value="/get_snacks_types/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getSnacksTypesVo(@PathVariable @Null Long id) throws Exception{
        SnacksTypesVo snacksTypesVo = snacksTypesService.getSnacksTypesVo(id);
        return new SnacksResult().ok(snacksTypesVo);
    }
}
