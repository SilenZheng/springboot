package com.example.springbootjpa.dao;

import com.example.springbootjpa.domain.UserDO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Before
    public void before(){
        UserDO userDO = new UserDO();
        userDO.setId(1L);
        userDO.setName("风清扬");
        userDO.setAccount("fengqy");
        userDO.setPwd("123456");
        userDao.save(userDO);
        userDO.setId(3L);
        userDO.setName("令狐冲");
        userDO.setAccount("linghuchong");
        userDO.setPwd("123456");
        userDao.save(userDO);
        userDO.setId(5L);
        userDO.setName("任盈盈");
        userDO.setAccount("renyingying");
        userDO.setPwd("123456");
        userDao.save(userDO);
    }

    @Test
    public void testAdd(){
        UserDO userDO = new UserDO();
        userDO.setId(2L);
        userDO.setName("郭靖");
        userDO.setAccount("guojing");
        userDO.setPwd("123456");
        userDao.save(userDO);
        userDO.setId(4L);
        userDO.setName("郭芙");
        userDO.setAccount("guofu");
        userDO.setPwd("123456");
        userDao.save(userDO);
    }

    @After
    public void after(){
        userDao.deleteById(1L);
        userDao.deleteById(3L);
        userDao.deleteById(5L);
    }
}
