package com.dubbo.service.impl;

import com.dubbo.api.service.UserService;
import com.dubbo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public List getListUser() {
        return userMapper.getListUser();
    }
}
