package com.abc.shop.dao;

import com.abc.shop.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjk
 * @since 2019-08-19
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
