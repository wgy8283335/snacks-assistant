package com.coconason.snacksassistantaccount.service;


import com.coconason.snacksassistantcommon.model.SnacksResult;

public interface IAccountInfoService {

    SnacksResult loginAccount(String code) throws Exception;


}
