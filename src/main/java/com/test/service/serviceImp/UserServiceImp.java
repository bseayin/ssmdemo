package com.test.service.serviceImp;

import com.test.entity.User;
import com.test.repository.UserRepository;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 2019/03/20
 */
@Service
public class UserServiceImp implements UserService {
    @Resource
    UserRepository userRepository;
    @Override
    //登录
    public boolean login(User user) {
        User user1=userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        boolean rs=false;
        if(user1!=null){
            rs=true;
        }
        return rs;
    }
}
