package com.abc.shop.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjk
 * @since 2019-08-19
 */
public class Logistics implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer ordersId;

    @TableField("estimatereceive_Time")
    private LocalDate estimatereceiveTime;

    @TableField("receiving_Time")
    private LocalDate receivingTime;

    private String name;

    private String phone;

    private String status;


    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public LocalDate getEstimatereceiveTime() {
        return estimatereceiveTime;
    }

    public void setEstimatereceiveTime(LocalDate estimatereceiveTime) {
        this.estimatereceiveTime = estimatereceiveTime;
    }

    public LocalDate getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(LocalDate receivingTime) {
        this.receivingTime = receivingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Logistics{" +
        "ordersId=" + ordersId +
        ", estimatereceiveTime=" + estimatereceiveTime +
        ", receivingTime=" + receivingTime +
        ", name=" + name +
        ", phone=" + phone +
        ", status=" + status +
        "}";
    }
}
