package com.abc.shop.entity;

public class CarKey {
    private Integer usersId;

    private Integer goodsId;

    public CarKey(Integer usersId, Integer goodsId) {
        this.usersId = usersId;
        this.goodsId = goodsId;
    }

    public CarKey() {
        super();
    }

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
}