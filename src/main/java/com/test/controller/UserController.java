package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;
    @RequestMapping("login")
    public Map login(User user){
        boolean rs=userService.login(user);
        Map map=new HashMap();
        map.put("rs",rs);
        return map;
    }
}
