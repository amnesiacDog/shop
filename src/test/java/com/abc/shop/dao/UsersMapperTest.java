package com.abc.shop.dao;


import com.abc.shop.entity.Users;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersMapperTest extends ServiceImpl<UsersMapper,Users> {

    @Test
    public void createDeployment() {
        List<Users> userList = baseMapper.selectList(null);
        Users user = baseMapper.selectByPrimaryKey(1);
        userList.forEach(System.out::println);
    }
}
