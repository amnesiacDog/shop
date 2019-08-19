package com.abc.shop.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjk
 * @since 2019-08-19
 */
public class Car implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer usersId;

    private Integer goodsId;

    private Integer goodsnumber;


    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
        "usersId=" + usersId +
        ", goodsId=" + goodsId +
        ", goodsnumber=" + goodsnumber +
        "}";
    }
}
