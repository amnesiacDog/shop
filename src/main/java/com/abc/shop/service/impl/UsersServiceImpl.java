package com.abc.shop.service.impl;

import com.abc.shop.entity.Users;
import com.abc.shop.dao.UsersMapper;
import com.abc.shop.service.UsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
