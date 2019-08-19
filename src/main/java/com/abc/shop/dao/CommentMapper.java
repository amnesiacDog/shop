package com.abc.shop.dao;

import com.abc.shop.entity.Comment;
import com.abc.shop.entity.CommentKey;

public interface CommentMapper {
    int deleteByPrimaryKey(CommentKey key);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(CommentKey key);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}