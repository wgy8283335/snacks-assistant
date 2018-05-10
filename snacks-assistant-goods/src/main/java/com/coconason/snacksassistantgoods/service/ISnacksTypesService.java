package com.coconason.snacksassistantgoods.service;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantgoods.vo.SnacksTypesVo;

public interface ISnacksTypesService {

    SnacksResult addSnacksTypesVo(SnacksTypesVo snacksTypesVo) throws Exception;

    SnacksResult deleteSnacksTypesVo(Long id) throws Exception;

    SnacksResult setSnacksTypesVo(SnacksTypesVo snacksTypesVo) throws Exception;

    SnacksTypesVo getSnacksTypesVo(long id) throws Exception;




}
