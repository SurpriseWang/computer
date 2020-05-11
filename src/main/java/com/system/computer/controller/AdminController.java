package com.system.computer.controller;

import com.system.computer.pojo.Admin;
import com.system.computer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AdminController {
    @Autowired(required = false)
    AdminService adminService;

    @RequestMapping("loginAdmin")
    public String loginAdmin(HttpServletResponse response, String adminName, String adminPassword) {
        List<Admin> admins = adminService.loginAdmin(adminName, adminPassword);
        response.addCookie(new Cookie("system", "admin"));
        response.addCookie(new Cookie("adminId", admins.get(0).getAdminId().toString()));
        response.addCookie(new Cookie("adminName", admins.get(0).getAdminName()));
        response.addCookie(new Cookie("online", "true"));
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @RequestMapping("logoutAdmin")
    public String logoutAdmin(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("system") || name.equals("adminId") || name.equals("adminName") || name.equals("online")) {
                cookie.setValue(null);
                response.addCookie(cookie);
            }
        }
        return "redirect:Http://localhost:8080/html/adminLogin.html";
    }
    @ResponseBody
    @RequestMapping("/queryAllAdminName")
    public List<Admin> queryAllAdminName(HttpServletRequest request){
        return adminService.queryAllAdminName();
    }
}
