package com.abc.shop.entity;

public class Car extends CarKey {
    private Integer goodsnumber;

    public Car(Integer usersId, Integer goodsId, Integer goodsnumber) {
        super(usersId, goodsId);
        this.goodsnumber = goodsnumber;
    }

    public Car() {
        super();
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }
}