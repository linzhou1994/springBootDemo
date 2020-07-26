package com.example.demo.coller;


import com.example.demo.dao.UserMapper;
import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestContrell {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("test")
    @ResponseBody
    public List<User> test(String name){
        return userMapper.select();
    }





}
