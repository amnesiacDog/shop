package com.abc.shop.entity;

import java.util.Date;

public class Orders {
    private Integer id;

    private String totleprice;

    private Date payTime;

    private Integer status;

    private String payType;

    private String payId;

    private Date createdTime;

    private Integer adressId;

    private Integer usersId;

    public Orders(Integer id, String totleprice, Date payTime, Integer status, String payType, String payId, Date createdTime, Integer adressId, Integer usersId) {
        this.id = id;
        this.totleprice = totleprice;
        this.payTime = payTime;
        this.status = status;
        this.payType = payType;
        this.payId = payId;
        this.createdTime = createdTime;
        this.adressId = adressId;
        this.usersId = usersId;
    }

    public Orders() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotleprice() {
        return totleprice;
    }

    public void setTotleprice(String totleprice) {
        this.totleprice = totleprice == null ? null : totleprice.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getAdressId() {
        return adressId;
    }

    public void setAdressId(Integer adressId) {
        this.adressId = adressId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
}