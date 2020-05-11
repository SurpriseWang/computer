package com.system.computer.controller;

import com.system.computer.pojo.Equipment;
import com.system.computer.service.EquipmentService;
import com.system.computer.vo.EquipmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentController {
    @Autowired(required = false)
    EquipmentService equipmentService;

    @ResponseBody
    @RequestMapping("/queryAllEquipment")
    public List<EquipmentVo> queryAllEquipment() {
        return equipmentService.queryAllEquipment();
    }

    @RequestMapping("/equipmentCreate")
    public String equipmentCreate(Integer equipmentCabinet, Integer equipmentStorehouse, String equipmentDescrible, Boolean equipmentOnline) {
        Equipment equipment = new Equipment();
        equipment.setEquipmentCabinet(equipmentCabinet);
        equipment.setEquipmentStorehouse(equipmentStorehouse);
        equipment.setEquipmentDescribe(equipmentDescrible);
        if (equipmentOnline)
            equipment.setEquipmentOnline(Byte.valueOf("1"));
        else equipment.setEquipmentOnline(Byte.valueOf("0"));
        equipmentService.equipmentCreate(equipment);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    //deleteEquipmentById
    @RequestMapping("/deleteEquipmentById")
    public String deleteEquipmentById(Integer[] equipmentId) {
        for (Integer id : equipmentId) {
            equipmentService.deleteEquipmentById(id);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }

    @ResponseBody
    @RequestMapping("/queryEquipmentByExample")
    public List<EquipmentVo> queryEquipmentByExample(Integer cabinetInput, Integer storehouseInput) {
        return equipmentService.queryEquipmentByExample(cabinetInput, storehouseInput);
    }
}
