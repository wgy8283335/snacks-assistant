package com.coconason.snacksassistantuser.service;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.AddressInfoVo;

import java.util.List;

public interface IAddressInfoService {

    SnacksResult addAddressInfoVo(AddressInfoVo addressInfoVo) throws Exception;

    SnacksResult deleteAddressInfoVo(Long id) throws Exception;

    SnacksResult setAddressInfoVo(AddressInfoVo addressInfoVo) throws Exception;

    AddressInfoVo getAddressInfoVo(long id) throws Exception;

    List<AddressInfoVo> getAddressInfoVoList(AddressInfoVo addressInfoVo) throws Exception;

}
