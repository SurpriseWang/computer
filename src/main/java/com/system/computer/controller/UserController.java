package com.system.computer.controller;

import com.system.computer.pojo.User;
import com.system.computer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {
    @Autowired(required = false)
    UserService userService;

    @RequestMapping("/loginUser")
    public String loginAdmin(HttpServletResponse response, String userName, String userPassword) {
        List<User> users = userService.loginUser(userName, userPassword);
        response.addCookie(new Cookie("system", "admin"));
        response.addCookie(new Cookie("userId", users.get(0).getUserId().toString()));
        response.addCookie(new Cookie("userName", users.get(0).getUserName()));
        response.addCookie(new Cookie("online", "true"));
        return "redirect:Http://localhost:8080/html/userIndex.html";
    }

    @RequestMapping("/logoutUser")
    public String logoutAdmin(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("system") || name.equals("userId") || name.equals("userName") || name.equals("online")) {
                cookie.setValue(null);
                response.addCookie(cookie);
            }
        }
        return "redirect:Http://localhost:8080/html/userLogin.html";
    }

    @ResponseBody
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    @RequestMapping("/deleteUsersById")
    public String deleteUsersById(Integer[] userId) {
        userService.deleteUsersById(userId);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @RequestMapping("/createUser")
    public String createUser(String userName, String userPassword) {
        userService.createUser(userName, userPassword);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }
}
