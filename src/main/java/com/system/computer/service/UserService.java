package com.system.computer.service;

import com.system.computer.pojo.User;

import java.util.List;

public interface UserService {
    List<User> loginUser(String userName, String userPassword);

    List<User> queryAllUser();

    void deleteUsersById(Integer[] userIds);

    void createUser(String userName, String userPassword);
}
