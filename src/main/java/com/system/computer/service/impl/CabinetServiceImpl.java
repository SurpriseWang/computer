package com.system.computer.service.impl;

import com.system.computer.mapper.CabinetMapper;
import com.system.computer.pojo.Cabinet;
import com.system.computer.pojo.CabinetExample;
import com.system.computer.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired(required = false)
    CabinetMapper cabinetMapper;

    @Override
    public List<Cabinet> queryAllCabinet() {
        CabinetExample cabinetExample = new CabinetExample();
        cabinetExample.createCriteria().andCabinetIdIsNotNull();
        return cabinetMapper.selectByExample(cabinetExample);
    }

    @Override
    public void createCabinet(String cabinetAddress) {
        Cabinet cabinet = new Cabinet();
        cabinet.setCabinetDescribe("0");
        cabinet.setCabinetAddress(cabinetAddress);
        cabinetMapper.insertSelective(cabinet);
    }

    @Override
    public void deleteCabinetById(Integer cabinetId) {
        cabinetMapper.deleteByPrimaryKey(cabinetId);
    }
}
