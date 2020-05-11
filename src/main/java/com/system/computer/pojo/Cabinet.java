package com.system.computer.pojo;

import java.io.Serializable;

public class Cabinet implements Serializable {
    private Integer cabinetId;

    private String cabinetDescribe;

    private String cabinetAddress;

    private static final long serialVersionUID = 1L;

    public Integer getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getCabinetDescribe() {
        return cabinetDescribe;
    }

    public void setCabinetDescribe(String cabinetDescribe) {
        this.cabinetDescribe = cabinetDescribe == null ? null : cabinetDescribe.trim();
    }

    public String getCabinetAddress() {
        return cabinetAddress;
    }

    public void setCabinetAddress(String cabinetAddress) {
        this.cabinetAddress = cabinetAddress == null ? null : cabinetAddress.trim();
    }
}