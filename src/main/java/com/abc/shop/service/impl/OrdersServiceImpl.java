package com.abc.shop.service.impl;

import com.abc.shop.entity.Orders;
import com.abc.shop.dao.OrdersMapper;
import com.abc.shop.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
