package com.coconason.snacksassistantgoods.service.impl;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.util.SnowflakeIdWorker;
import com.coconason.snacksassistantgoods.cast.CastUtil;
import com.coconason.snacksassistantgoods.dao.SnacksTypesMapper;
import com.coconason.snacksassistantgoods.po.SnacksTypes;
import com.coconason.snacksassistantgoods.po.SnacksTypesExample;
import com.coconason.snacksassistantgoods.service.ISnacksTypesService;
import com.coconason.snacksassistantcommon.vo.SnacksTypesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class SnacksTypesServiceImpl implements ISnacksTypesService {

    @Autowired
    private SnacksTypesMapper snacksTypesMapper;
    @Value("${server-id}")
    private long serverId;
    @Value("${center-id}")
    private long dataCenterId;
    private final byte NO = 0;
    private final byte YES = 1;

    @Override
    public SnacksResult addSnacksTypesVo(SnacksTypesVo snacksTypesVo) throws Exception{
        SnacksTypes snacksTypes = CastUtil.SnacksTypesVoToSnacksTypes(snacksTypesVo);
        Date now = new Date();
        snacksTypes.setCreateTime(now);
        snacksTypes.setUpdateTime(now);
        snacksTypes.setDeleted(NO);
        snacksTypes.setId(new SnowflakeIdWorker(serverId, dataCenterId).nextId());
        if (snacksTypesMapper.insertSelective(snacksTypes)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }
    @Override
    public SnacksResult deleteSnacksTypesVo(Long id) throws Exception{
        SnacksTypes snacksTypes = new SnacksTypes();
        snacksTypes.setId(id);
        snacksTypes.setDeleted(YES);
        if (snacksTypesMapper.updateByPrimaryKeySelective(snacksTypes)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksResult setSnacksTypesVo(SnacksTypesVo snacksTypesVo) throws Exception{
        SnacksTypesExample snacksTypesExample = new SnacksTypesExample();
        SnacksTypesExample.Criteria snacksTypesCriteria = snacksTypesExample.createCriteria();
        snacksTypesCriteria.andIdEqualTo(snacksTypesVo.getId());
        SnacksTypes snacksTypes = CastUtil.SnacksTypesVoToSnacksTypes(snacksTypesVo);
        Date now = new Date();
        snacksTypes.setUpdateTime(now);
         if (snacksTypesMapper.updateByExampleSelective(snacksTypes,snacksTypesExample)>0){
            return new SnacksResult().ok();
        }else{
            return new SnacksResult().build(ErrorCode.RECORD_NOT_EXIST_ERROR.value(),ErrorCode.RECORD_NOT_EXIST_ERROR.msg());
        }
    }
    @Override
    public SnacksTypesVo getSnacksTypesVo(long id) throws Exception{
        SnacksTypes snacksTypes = snacksTypesMapper.selectByPrimaryKey(id);
        return CastUtil.SnacksTypesToSnacksTypesVo(snacksTypes);
    }
}
