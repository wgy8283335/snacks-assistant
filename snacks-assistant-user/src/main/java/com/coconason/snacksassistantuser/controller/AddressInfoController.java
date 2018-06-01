package com.coconason.snacksassistantuser.controller;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import com.coconason.snacksassistantuser.service.IAddressInfoService;
import com.coconason.snacksassistantcommon.vo.AddressInfoVo;
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
public class AddressInfoController {

    @Autowired
    IAddressInfoService addressInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(AddressInfoController.class);

    @ApiOperation(value="Add the information of the address_info", notes="")
    @RequestMapping(value="/add_address_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult addAddressInfoVo(@RequestBody @Validated AddressInfoVo addressInfoVo) throws Exception{
        SnacksResult snacksResult = addressInfoService.addAddressInfoVo(addressInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Delete the information of the address_info", notes="")
    @RequestMapping(value="/delete_address_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult deleteAddressInfoVo(@RequestParam @Null Long id) throws Exception{
        SnacksResult snacksResult = addressInfoService.deleteAddressInfoVo(id);
        return snacksResult;
    }

    @ApiOperation(value="Modify the information of the address_info", notes="")
    @RequestMapping(value="/set_address_info",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult setAddressInfoVo(@RequestBody @Validated AddressInfoVo addressInfoVo) throws Exception{
        SnacksResult snacksResult = addressInfoService.setAddressInfoVo(addressInfoVo);
        return snacksResult;
    }

    @ApiOperation(value="Query the information of the address_info", notes="")
    @RequestMapping(value="/get_address_info/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getAddressInfoVo(@PathVariable @Null Long id) throws Exception{
        AddressInfoVo addressInfoVo = addressInfoService.getAddressInfoVo(id);
        return new SnacksResult().ok(addressInfoVo);
    }
    @ApiOperation(value="Query the information of the address_info", notes="")
    @RequestMapping(value="/get_address_info_list",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult getAddressInfoVoList(@RequestBody @Validated AddressInfoVo addressInfoVo) throws Exception{
        List<AddressInfoVo> addressInfoVoList = addressInfoService.getAddressInfoVoList(addressInfoVo);
        return new SnacksResult().ok(addressInfoVoList);
    }
}
