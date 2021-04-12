package com.database.mysql.serviceImpl;


import com.database.mysql.bean.UserBean;
import com.database.mysql.mapper.UserMapper;
import com.database.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
