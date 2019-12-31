package com.grizzly.service.Impl;

import com.grizzly.repositories.TestRepository;
import com.grizzly.mapper.UserMapper;
import com.grizzly.pojo.Admin;
import com.grizzly.service.UserService;
import com.grizzly.utils.RedisUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private TestRepository testRepository;
    @Resource
    private RedisUtil redisUtil;

    @Override
    public Map<String, Object> getUsers(Model model) {
//        List <Admin> list = userMapper.getUsers();
        List<Admin> list2 = testRepository.findAll();
        Map<String,Object> map = new HashMap<>();
//        System.out.println(list2.toString());
        model.addAttribute("users",list2);
        map.put("users",list2);
        System.out.println(map.toString());
        return map;
    }

    @Override
    public String getUsers2(Model model) {
        //        List <Admin> list = userMapper.getUsers();
        List<Admin> list2 = testRepository.findAll();
        Map<String,Object> map = new HashMap<>();
//        System.out.println(list2.toString());
        model.addAttribute("users",list2);
//        map.put("users",list2);
//        System.out.println(map.toString());
        return "show::table";
    }
}
