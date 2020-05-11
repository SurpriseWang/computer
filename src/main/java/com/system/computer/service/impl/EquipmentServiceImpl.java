package com.system.computer.service.impl;

import com.system.computer.mapper.CabinetMapper;
import com.system.computer.mapper.EquipmentMapper;
import com.system.computer.mapper.StorehouseMapper;
import com.system.computer.pojo.Cabinet;
import com.system.computer.pojo.Equipment;
import com.system.computer.pojo.EquipmentExample;
import com.system.computer.pojo.Storehouse;
import com.system.computer.service.EquipmentService;
import com.system.computer.vo.EquipmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired(required = false)
    EquipmentMapper equipmentMapper;
    @Autowired(required = false)
    CabinetMapper cabinetMapper;
    @Autowired(required = false)
    StorehouseMapper storehouseMapper;

    @Override
    public List<EquipmentVo> queryAllEquipment() {
        List<EquipmentVo> equipmentVos = new ArrayList<>();
        EquipmentExample equipmentExample = new EquipmentExample();
        equipmentExample.createCriteria().andEquipmentIdIsNotNull();
        List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
        for (Equipment equipment : equipments) {
            Cabinet cabinet = cabinetMapper.selectByPrimaryKey(equipment.getEquipmentCabinet());
            Storehouse storehouse = storehouseMapper.selectByPrimaryKey(equipment.getEquipmentStorehouse());
            EquipmentVo equipmentVo = new EquipmentVo();
            equipmentVo.cabinet = cabinet;
            equipmentVo.storehouse = storehouse;
            equipmentVo.equipment = equipment;
            equipmentVos.add(equipmentVo);
        }
        return equipmentVos;
    }

    @Override
    public void equipmentCreate(Equipment equipment) {
        Cabinet cabinet = cabinetMapper.selectByPrimaryKey(equipment.getEquipmentCabinet());
        Integer value = Integer.valueOf(cabinet.getCabinetDescribe());
        cabinet.setCabinetDescribe((value += 1).toString());
        cabinetMapper.updateByPrimaryKey(cabinet);
        Storehouse storehouse = storehouseMapper.selectByPrimaryKey(equipment.getEquipmentStorehouse());
        value = Integer.valueOf(storehouse.getStorehouseDescribe());
        storehouse.setStorehouseDescribe((value += 1).toString());
        storehouseMapper.updateByPrimaryKey(storehouse);
        equipmentMapper.insertSelective(equipment);
    }

    @Override
    public void deleteEquipmentById(Integer equipmentId) {
        equipmentMapper.deleteByPrimaryKey(equipmentId);
    }

    @Override
    public List<EquipmentVo> queryEquipmentByExample(Integer cabinetInput, Integer cabinetInput1) {
        List<EquipmentVo> equipmentVos = new ArrayList<>();
        EquipmentExample equipmentExample = new EquipmentExample();
        equipmentExample.createCriteria().andEquipmentIdIsNotNull().andEquipmentCabinetEqualTo(cabinetInput).andEquipmentCabinetEqualTo(cabinetInput);
        List<Equipment> equipments = equipmentMapper.selectByExample(equipmentExample);
        for (Equipment equipment : equipments) {
            Cabinet cabinet = cabinetMapper.selectByPrimaryKey(equipment.getEquipmentCabinet());
            Storehouse storehouse = storehouseMapper.selectByPrimaryKey(equipment.getEquipmentStorehouse());
            EquipmentVo equipmentVo = new EquipmentVo();
            equipmentVo.cabinet = cabinet;
            equipmentVo.storehouse = storehouse;
            equipmentVo.equipment = equipment;
            equipmentVos.add(equipmentVo);
        }
        return equipmentVos;
    }
}
