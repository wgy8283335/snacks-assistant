package com.coconason.snacksassistantconsumer.clinets;


import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SnacksAssistantUserFallback implements SnacksAssistantUserClient{

    public SnacksResult getUserInfoVo(Long id){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }

    public SnacksResult getUserInfoVoList(UserInfoVo userInfoVo){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }

    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }
}
