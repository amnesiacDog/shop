package com.abc.shop.entity;

public class Goods {
    private Integer id;

    private String name;

    private String description;

    private Integer price;

    private Integer goodsTypeId;

    public Goods(Integer id, String name, String description, Integer price, Integer goodsTypeId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.goodsTypeId = goodsTypeId;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }
}