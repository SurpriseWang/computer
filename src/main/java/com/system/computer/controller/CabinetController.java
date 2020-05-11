package com.system.computer.controller;

import com.system.computer.pojo.Cabinet;
import com.system.computer.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CabinetController {
    @Autowired(required = false)
    CabinetService cabinetService;

    @RequestMapping("/createCabinet")
    public String createCabinet(String cabinetAddress) {
        cabinetService.createCabinet(cabinetAddress);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @ResponseBody
    @RequestMapping("/queryAllCabinet")
    public List<Cabinet> queryAllCabinet() {
        return cabinetService.queryAllCabinet();
    }

    @RequestMapping("/deleteCabinetById")
    public String deleteCabinetById(Integer[] cabinetId) {
        for (Integer cabId : cabinetId) {
            cabinetService.deleteCabinetById(cabId);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }
}
