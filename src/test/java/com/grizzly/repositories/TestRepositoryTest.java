package com.grizzly.repositories;

import com.grizzly.pojo.Admin;
import com.grizzly.repositories.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepositoryTest {

    @Resource
    private TestRepository testRepository;

    @Test
    public void findByIdTest() {
        Admin admin = testRepository.findByAid(1);
        assertNotNull(admin);
    }
}