package com.coconason.snacksassistantuser.po;

import java.io.Serializable;
import java.util.Date;

public class AddressInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.postal_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String postalCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.national_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String nationalCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.province_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.city_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.county_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String countyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.detail_info
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String detailInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.recipients
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String recipients;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.contacts
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private String contacts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.user_info_id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private Long userInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.deleted
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private Byte deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.update_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_info.create_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address_info
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.id
     *
     * @return the value of address_info.id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.id
     *
     * @param id the value for address_info.id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.postal_code
     *
     * @return the value of address_info.postal_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.postal_code
     *
     * @param postalCode the value for address_info.postal_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.national_code
     *
     * @return the value of address_info.national_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getNationalCode() {
        return nationalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.national_code
     *
     * @param nationalCode the value for address_info.national_code
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode == null ? null : nationalCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.province_name
     *
     * @return the value of address_info.province_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.province_name
     *
     * @param provinceName the value for address_info.province_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.city_name
     *
     * @return the value of address_info.city_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.city_name
     *
     * @param cityName the value for address_info.city_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.county_name
     *
     * @return the value of address_info.county_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.county_name
     *
     * @param countyName the value for address_info.county_name
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.detail_info
     *
     * @return the value of address_info.detail_info
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getDetailInfo() {
        return detailInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.detail_info
     *
     * @param detailInfo the value for address_info.detail_info
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo == null ? null : detailInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.recipients
     *
     * @return the value of address_info.recipients
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getRecipients() {
        return recipients;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.recipients
     *
     * @param recipients the value for address_info.recipients
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.contacts
     *
     * @return the value of address_info.contacts
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.contacts
     *
     * @param contacts the value for address_info.contacts
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.user_info_id
     *
     * @return the value of address_info.user_info_id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.user_info_id
     *
     * @param userInfoId the value for address_info.user_info_id
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.deleted
     *
     * @return the value of address_info.deleted
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.deleted
     *
     * @param deleted the value for address_info.deleted
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.update_time
     *
     * @return the value of address_info.update_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.update_time
     *
     * @param updateTime the value for address_info.update_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_info.create_time
     *
     * @return the value of address_info.create_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_info.create_time
     *
     * @param createTime the value for address_info.create_time
     *
     * @mbggenerated Fri Jun 08 11:43:17 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}