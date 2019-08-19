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
public class Orders implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String totleprice;

    @TableField("pay_Time")
    private LocalDate payTime;

    /**
     * 璁㈠崟鐘舵? 宸蹭粯娆?寰呭彂璐? 1,鏈?粯娆?0 ,鍙戣揣涓?2 , 鏀惰揣 寰呰瘎璁?3  ,宸茶瘎璁?4
     */
    private Integer status;

    @TableField("pay_Type")
    private String payType;

    @TableField("pay_Id")
    private String payId;

    @TableField("created_Time")
    private LocalDate createdTime;

    private Integer adressId;

    private Integer usersId;


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
        this.totleprice = totleprice;
    }

    public LocalDate getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDate payTime) {
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
        this.payType = payType;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
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

    @Override
    public String toString() {
        return "Orders{" +
        "id=" + id +
        ", totleprice=" + totleprice +
        ", payTime=" + payTime +
        ", status=" + status +
        ", payType=" + payType +
        ", payId=" + payId +
        ", createdTime=" + createdTime +
        ", adressId=" + adressId +
        ", usersId=" + usersId +
        "}";
    }
}
