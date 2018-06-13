package com.coconason.snacksassistantgoods.service;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.SnacksInventoryVo;

public interface ISnacksInventoryService {

    SnacksResult addSnacksInventoryVo(SnacksInventoryVo snacksInventoryVo) throws Exception;

    SnacksResult deleteSnacksInventoryVo(Long id) throws Exception;

    SnacksResult setSnacksInventoryVo(SnacksInventoryVo snacksInventoryVo) throws Exception;

    SnacksInventoryVo getSnacksInventoryVo(long id) throws Exception;

}
