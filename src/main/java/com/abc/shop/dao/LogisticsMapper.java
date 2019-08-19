package com.abc.shop.dao;

import com.abc.shop.entity.Logistics;

public interface LogisticsMapper {
    int deleteByPrimaryKey(Integer ordersId);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    Logistics selectByPrimaryKey(Integer ordersId);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}