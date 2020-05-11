package com.system.computer.service;

import com.system.computer.pojo.Storehouse;

import java.util.List;

public interface StorehouseService {
    List<Storehouse> queryAllStorehouse();

    void deleteStorehouseById(Integer storehouseId);

    void createStorehouse(String storehouseAddress);
}
