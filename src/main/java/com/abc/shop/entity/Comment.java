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
public class Comment implements Serializable {

    private static final long serialVersionUID=1L;

    private String description;

    private Integer goodsId;

    private Integer score;

    private Integer userId;

    private Integer isAnonymous;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "description=" + description +
        ", goodsId=" + goodsId +
        ", score=" + score +
        ", userId=" + userId +
        ", isAnonymous=" + isAnonymous +
        "}";
    }
}
