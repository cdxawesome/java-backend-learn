package com.ricorich.service;

import com.ricorich.mapper.UserMapper;
import com.ricorich.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 根据id查询
    public User queryBtId(Long id) {
        // 这里是直接使用了通用Mapper里面的方法经常sql操作
        return userMapper.selectByPrimaryKey(id);
    }

    // 新增保存用户
    @Transactional
    public void saveUser(User user) {
        /*下面两个insert的方法都可以插入一个数据。
        * 第二个表示插入选择性数据：如果在user对象里面有些属性没有赋值是空的，
        * 那么这个方法在执行sql的时候就不会将这些属性值拼接到insert语句中*/
//        userMapper.insert(user);
        userMapper.insertSelective(user);
//        int i = 10/0;
    }
}
