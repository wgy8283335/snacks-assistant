package com.coconason.snacksassistantaccount.controller;


import com.coconason.snacksassistantaccount.service.IAccountInfoService;
import com.coconason.snacksassistantcommon.constant.ErrorCode;
import com.coconason.snacksassistantcommon.model.SnacksResult;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountInfoController {

    @Autowired
    IAccountInfoService accountInfoService;

    //Get log4j2 object
    private static final Logger LOG = LogManager.getLogger(AccountInfoController.class);

    @ApiOperation(value="Login of the account", notes="")
    @RequestMapping(value="/login_account",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SnacksResult loginAccount(@RequestParam String code){
        try{
            SnacksResult snacksResult = accountInfoService.loginAccount(code);
            return snacksResult;
        }catch (Exception exception){
            return new SnacksResult(ErrorCode.SYS_ERROR.value(),ErrorCode.SYS_ERROR.msg());
        }
    }

}
