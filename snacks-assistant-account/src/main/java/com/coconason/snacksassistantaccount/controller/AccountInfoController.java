package com.coconason.snacksassistantaccount.controller;


import com.coconason.snacksassistantaccount.service.IAccountInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountInfoController {

    @Autowired
    IAccountInfoService accountInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(AccountInfoController.class);


}
