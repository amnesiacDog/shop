package com.abc.shop.service.impl;

import com.abc.shop.entity.Car;
import com.abc.shop.dao.CarMapper;
import com.abc.shop.service.CarService;
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
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

}
