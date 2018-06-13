package com.coconason.snacksassistantgoods.po;

import java.io.Serializable;
import java.util.Date;

public class SnacksInventory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.snacks_info_id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Long snacksInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.quantity
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.receive_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Date receiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.deleted
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Byte deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.update_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column snacks_inventory.create_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table snacks_inventory
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.id
     *
     * @return the value of snacks_inventory.id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.id
     *
     * @param id the value for snacks_inventory.id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.snacks_info_id
     *
     * @return the value of snacks_inventory.snacks_info_id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Long getSnacksInfoId() {
        return snacksInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.snacks_info_id
     *
     * @param snacksInfoId the value for snacks_inventory.snacks_info_id
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setSnacksInfoId(Long snacksInfoId) {
        this.snacksInfoId = snacksInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.quantity
     *
     * @return the value of snacks_inventory.quantity
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.quantity
     *
     * @param quantity the value for snacks_inventory.quantity
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.receive_time
     *
     * @return the value of snacks_inventory.receive_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.receive_time
     *
     * @param receiveTime the value for snacks_inventory.receive_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.deleted
     *
     * @return the value of snacks_inventory.deleted
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.deleted
     *
     * @param deleted the value for snacks_inventory.deleted
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.update_time
     *
     * @return the value of snacks_inventory.update_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.update_time
     *
     * @param updateTime the value for snacks_inventory.update_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column snacks_inventory.create_time
     *
     * @return the value of snacks_inventory.create_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column snacks_inventory.create_time
     *
     * @param createTime the value for snacks_inventory.create_time
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}