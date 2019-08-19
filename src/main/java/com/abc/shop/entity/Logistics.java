package com.abc.shop.entity;

import java.util.Date;

public class Logistics {
    private Integer ordersId;

    private Date estimatereceiveTime;

    private Date receivingTime;

    private String name;

    private String phone;

    private String status;

    public Logistics(Integer ordersId, Date estimatereceiveTime, Date receivingTime, String name, String phone, String status) {
        this.ordersId = ordersId;
        this.estimatereceiveTime = estimatereceiveTime;
        this.receivingTime = receivingTime;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }

    public Logistics() {
        super();
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Date getEstimatereceiveTime() {
        return estimatereceiveTime;
    }

    public void setEstimatereceiveTime(Date estimatereceiveTime) {
        this.estimatereceiveTime = estimatereceiveTime;
    }

    public Date getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = receivingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}