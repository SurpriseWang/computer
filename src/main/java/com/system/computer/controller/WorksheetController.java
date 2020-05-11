package com.system.computer.controller;

import com.system.computer.pojo.Worksheet;
import com.system.computer.service.WorksheetService;
import com.system.computer.vo.WorksheetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WorksheetController {
    @Autowired(required = false)
    WorksheetService worksheetService;

    @ResponseBody
    @RequestMapping("/queryAllWorksheet")
    public List<WorksheetVo> queryAllWorksheet(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("adminId")) {
                return worksheetService.queryAllWorksheet(Integer.valueOf(cookie.getValue()));
            }
        }
        return null;
    }

    @RequestMapping("/deleteWorkSheetById")
    public String deleteWorkSheetById(Integer[] worksheetId) {
        for (Integer id : worksheetId) {
            worksheetService.deleteWorksheet(id);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @ResponseBody
    @RequestMapping("queryAllReturnWorksheet")
    public List<WorksheetVo> queryAllReturnWorksheet(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("adminId")) {
                return worksheetService.queryAllReturnWorksheet(Integer.valueOf(cookie.getValue()));
            }
        }
        return null;
    }

    @RequestMapping("/returnWorkSheetById")
    public String returnWorkSheetById(Integer[] worksheetId) {
        for (Integer id : worksheetId) {
            worksheetService.returnWorkSheetById(id);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @ResponseBody
    @RequestMapping("/queryAllWorksheetUser")
    public List<WorksheetVo> queryAllWorksheetUser(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("userId")) {
                return worksheetService.queryAllWorksheetUser(Integer.valueOf(cookie.getValue()));
            }
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/queryAllWorksheetUserBack")
    public List<WorksheetVo> queryAllWorksheetUserBack(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("userId")) {
                return worksheetService.queryAllWorksheetUserBack(Integer.valueOf(cookie.getValue()));
            }
        }
        return null;
    }

    @RequestMapping("/worksheetCreate")
    public String worksheetCreate(HttpServletRequest request, Integer worksheetAdmin, String worksheetContent,String worksheetEquipment) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("userId")) {
                Worksheet worksheet = new Worksheet();
                worksheet.setWorksheetApproval(Byte.valueOf("0"));
                worksheet.setWorksheetAdmin(worksheetAdmin);
                worksheet.setWorksheetUser(Integer.valueOf(cookie.getValue()));
                worksheet.setWorksheetContent(worksheetEquipment+worksheetContent);
                worksheetService.createWorksheet(worksheet);
            }
        }
        return "redirect:Http://localhost:8080/html/userIndex.html";
    }
}
