package com.abc.shop.entity;

public class Comment extends CommentKey {
    private String description;

    private Integer score;

    private Byte isAnonymous;

    public Comment(Integer goodsId, Integer userId, String description, Integer score, Byte isAnonymous) {
        super(goodsId, userId);
        this.description = description;
        this.score = score;
        this.isAnonymous = isAnonymous;
    }

    public Comment() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Byte getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Byte isAnonymous) {
        this.isAnonymous = isAnonymous;
    }
}