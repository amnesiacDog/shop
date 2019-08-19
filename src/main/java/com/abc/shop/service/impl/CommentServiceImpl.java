package com.abc.shop.service.impl;

import com.abc.shop.entity.Comment;
import com.abc.shop.dao.CommentMapper;
import com.abc.shop.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjk
 * @since 2019-08-19
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
