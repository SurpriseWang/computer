package com.system.computer.service.impl;

import com.system.computer.mapper.AdminMapper;
import com.system.computer.pojo.Admin;
import com.system.computer.pojo.AdminExample;
import com.system.computer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired(required = false)
    AdminMapper adminMapper;

    @Override
    public List<Admin> loginAdmin(String adminName, String adminPassword) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminNameEqualTo(adminName).andAdminPasswordEqualTo(adminPassword);
        return adminMapper.selectByExample(adminExample);
    }

    @Override
    public List<Admin> queryAllAdminName() {
        List<Admin> users = new ArrayList<>();
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminNameIsNotNull();
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        for (Admin admin:admins) {
            admin.setAdminPassword("");
            users.add(admin);
        }
        return users;
    }
}
