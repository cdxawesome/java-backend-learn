package com.ricorich.service;

import com.ricorich.mapper.UserMapper;
import com.ricorich.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryBtId(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
