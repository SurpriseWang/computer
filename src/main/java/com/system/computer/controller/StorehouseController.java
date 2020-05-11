package com.system.computer.controller;

import com.system.computer.pojo.Storehouse;
import com.system.computer.service.StorehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StorehouseController {
    @Autowired(required = false)
    StorehouseService storehouseService;

    @ResponseBody
    @RequestMapping("/queryAllStorehouse")
    public List<Storehouse> queryAllStorehouse() {
        return storehouseService.queryAllStorehouse();
    }

    @RequestMapping("/deleteStorehouseById")
    public String deleteStorehouseById(Integer[] storehouseId) {
        for (Integer id : storehouseId) {
            storehouseService.deleteStorehouseById(id);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @RequestMapping("/createStorehouse")
    public String createStorehouse(String storehouseAddress) {
        storehouseService.createStorehouse(storehouseAddress);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }
}