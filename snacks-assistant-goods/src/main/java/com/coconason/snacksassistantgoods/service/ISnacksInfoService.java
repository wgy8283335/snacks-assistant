package com.coconason.snacksassistantgoods.service;

import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.SnacksInfoVo;

public interface ISnacksInfoService {

    SnacksResult addSnacksInfoVo(SnacksInfoVo snacksInfoVo) throws Exception;

    SnacksResult deleteSnacksInfoVo(Long id) throws Exception;

    SnacksResult setSnacksInfoVo(SnacksInfoVo snacksInfoVo) throws Exception;

    SnacksInfoVo getSnacksInfoVo(long id) throws Exception;

}
