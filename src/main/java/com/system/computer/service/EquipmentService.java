package com.system.computer.service;

import com.system.computer.pojo.Equipment;
import com.system.computer.vo.EquipmentVo;

import java.util.List;

public interface EquipmentService {
    List<EquipmentVo> queryAllEquipment();

    void equipmentCreate(Equipment equipment);

    void deleteEquipmentById(Integer equipmentId);
}
