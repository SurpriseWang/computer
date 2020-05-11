package com.system.computer.service.impl;

import com.system.computer.mapper.UserMapper;
import com.system.computer.pojo.User;
import com.system.computer.pojo.UserExample;
import com.system.computer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public List<User> loginUser(String userName, String userPassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> queryAllUser() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public void deleteUsersById(Integer[] userIds) {
        for (Integer userId : userIds) {
            userMapper.deleteByPrimaryKey(userId);
        }
    }

    @Override
    public void createUser(String userName, String userPassword) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        userMapper.insertSelective(user);
    }
}