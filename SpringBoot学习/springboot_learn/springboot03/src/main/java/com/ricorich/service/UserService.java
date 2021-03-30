package com.ricorich.service;

import com.ricorich.pojo.User;

public class UserService {

    // 根据id查询
    public User queryBtId(Long id) {
        return new User();
    }

    // 新增保存用户
    public void saveUser(User user) {
        System.out.println("用户保存成功");
    }
}
