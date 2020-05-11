package com.system.computer.pojo;

import java.io.Serializable;

public class Equipment implements Serializable {
    private Integer equipmentId;

    private String equipmentDescribe;

    private Integer equipmentCabinet;

    private Integer equipmentStorehouse;

    private Byte equipmentOnline;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentDescribe() {
        return equipmentDescribe;
    }

    public void setEquipmentDescribe(String equipmentDescribe) {
        this.equipmentDescribe = equipmentDescribe == null ? null : equipmentDescribe.trim();
    }

    public Integer getEquipmentCabinet() {
        return equipmentCabinet;
    }

    public void setEquipmentCabinet(Integer equipmentCabinet) {
        this.equipmentCabinet = equipmentCabinet;
    }

    public Integer getEquipmentStorehouse() {
        return equipmentStorehouse;
    }

    public void setEquipmentStorehouse(Integer equipmentStorehouse) {
        this.equipmentStorehouse = equipmentStorehouse;
    }

    public Byte getEquipmentOnline() {
        return equipmentOnline;
    }

    public void setEquipmentOnline(Byte equipmentOnline) {
        this.equipmentOnline = equipmentOnline;
    }
}