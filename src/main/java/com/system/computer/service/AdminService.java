package com.system.computer.service;

import com.system.computer.pojo.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> loginAdmin(String adminName, String adminPassword);

    List<Admin> queryAllAdminName();
}
