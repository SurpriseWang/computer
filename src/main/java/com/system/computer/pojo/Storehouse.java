package com.system.computer.pojo;

import java.io.Serializable;

public class Storehouse implements Serializable {
    private Integer storehouseId;

    private String storehouseDescribe;

    private String storehouseAddress;

    private static final long serialVersionUID = 1L;

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }

    public String getStorehouseDescribe() {
        return storehouseDescribe;
    }

    public void setStorehouseDescribe(String storehouseDescribe) {
        this.storehouseDescribe = storehouseDescribe == null ? null : storehouseDescribe.trim();
    }

    public String getStorehouseAddress() {
        return storehouseAddress;
    }

    public void setStorehouseAddress(String storehouseAddress) {
        this.storehouseAddress = storehouseAddress == null ? null : storehouseAddress.trim();
    }
}