package com.abc.shop.entity;

public class CommentKey {
    private Integer goodsId;

    private Integer userId;

    public CommentKey(Integer goodsId, Integer userId) {
        this.goodsId = goodsId;
        this.userId = userId;
    }

    public CommentKey() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}