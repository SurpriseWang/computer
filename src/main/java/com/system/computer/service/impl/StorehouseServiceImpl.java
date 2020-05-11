package com.system.computer.service.impl;

import com.system.computer.mapper.StorehouseMapper;
import com.system.computer.pojo.Storehouse;
import com.system.computer.pojo.StorehouseExample;
import com.system.computer.service.StorehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorehouseServiceImpl implements StorehouseService {
    @Autowired(required = false)
    StorehouseMapper storehouseMapper;

    @Override
    public List<Storehouse> queryAllStorehouse() {
        StorehouseExample storehouseExample = new StorehouseExample();
        storehouseExample.createCriteria().andStorehouseIdIsNotNull();
        return storehouseMapper.selectByExample(storehouseExample);
    }

    @Override
    public void deleteStorehouseById(Integer storehouseId) {
        storehouseMapper.deleteByPrimaryKey(storehouseId);
    }

    @Override
    public void createStorehouse(String storehouseAddress) {
        Storehouse storehouse = new Storehouse();
        storehouse.setStorehouseDescribe("0");
        storehouse.setStorehouseAddress(storehouseAddress);
        storehouseMapper.insertSelective(storehouse);
    }
}
