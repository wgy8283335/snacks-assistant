package com.coconason.snacksassistantconsumer.clinets;


import com.coconason.snacksassistantconsumer.constant.ErrorCode;
import com.coconason.snacksassistantconsumer.model.SnacksResult;
import com.coconason.snacksassistantconsumer.vo.UserInfoVo;
import org.springframework.stereotype.Component;

@Component
public class SnacksAssistantUserFallback implements SnacksAssistantUserClient{

    public SnacksResult getUserInfoVo(Long id){
        return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }

    public SnacksResult setUserInfoVo(UserInfoVo userInfoVo){
        return SnacksResult.build(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
    }
}
