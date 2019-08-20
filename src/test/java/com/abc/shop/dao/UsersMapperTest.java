package com.abc.shop.dao;

import com.abc.shop.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersMapperTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void Test(){
        Users users = usersMapper.selectById(1);
        System.out.println(users);
    }
}