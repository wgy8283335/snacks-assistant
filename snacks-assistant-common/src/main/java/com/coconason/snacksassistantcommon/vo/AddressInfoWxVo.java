package com.coconason.snacksassistantcommon.vo;

import java.io.Serializable;

public class AddressInfoWxVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private  String Id;

    private String address;

    private String recipient;
    //
    private String contact;
    //
    private Long userInfoId;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }
}