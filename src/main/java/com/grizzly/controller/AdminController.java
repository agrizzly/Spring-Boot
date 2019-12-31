package com.grizzly.controller;

import com.grizzly.pojo.Admin;
import com.grizzly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    private  UserService userService;

//    @RequestMapping("/")
//    public String toIndex() {
//        System.out.println("访问根目录");
//        return "index";
//    }


    @RequestMapping("/getusers")
    @ResponseBody
    public Map<String, Object> getUsers(Model model) {
        return userService.getUsers(model);
    }

    @RequestMapping("/getusers2")
    public String getUsers2(Model model) {
        return userService.getUsers2(model);
    }

    @RequestMapping("/add")
    public String save(@ModelAttribute("Admin") Admin admin , Model model ){
        System.out.println(admin.toString());
        return "ok";
    }
}
