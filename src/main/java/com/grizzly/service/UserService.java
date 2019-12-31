package com.grizzly.service;

import com.grizzly.pojo.Admin;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

public interface UserService {
    Map<String,Object> getUsers(Model model);
    String  getUsers2(Model model);
}
