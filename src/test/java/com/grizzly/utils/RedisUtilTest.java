package com.grizzly.utils;

import com.grizzly.pojo.Admin;
import com.grizzly.repositories.TestRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RedisUtilTest {

    @Resource
    private RedisUtil redisUtil;
    @Resource
    private TestRepository testRepository;

    @Test
    public void set(){

        List <Admin> list2 = testRepository.findAll();
        System.out.println(list2.toString());
        redisUtil.set("user",list2);

    }

    @Test
    public void testFirst() {
        Boolean or = redisUtil.hasKey("user");
        if(or)
            System.out.println("存在");
        else
            System.out.println("不存在");
    }

    @Test
    public void testSecond(){
        List<Admin> list = (List<Admin>) redisUtil.get("user");
        System.out.println(list.toString());
    }

    @Test
    public void testThree() {
        redisUtil.del("user");
    }
}