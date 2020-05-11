package com.system.computer.service;

import com.system.computer.pojo.Cabinet;

import java.util.List;

public interface CabinetService {
    List<Cabinet> queryAllCabinet();

    void createCabinet(String cabinetAddress);

    void deleteCabinetById(Integer cabinetId);
}
