package com.coconason.snacksassistantorder.clients;

import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import com.coconason.snacksassistantcommon.vo.UserInfoVo;
import org.springframework.stereotype.Component;

@Component
public class SnacksAssistantGoodsFallback {

    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo){
        return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }
}
