package com.abc.shop.dao;

import com.abc.shop.entity.Car;
import com.abc.shop.entity.CarKey;

public interface CarMapper {
    int deleteByPrimaryKey(CarKey key);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(CarKey key);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}