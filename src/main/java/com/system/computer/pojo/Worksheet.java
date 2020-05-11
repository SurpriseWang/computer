package com.system.computer.pojo;

import java.io.Serializable;

public class Worksheet implements Serializable {
    private Integer worksheetId;

    private String worksheetContent;

    private Byte worksheetApproval;

    private Integer worksheetAdmin;

    private Integer worksheetUser;

    private static final long serialVersionUID = 1L;

    public Integer getWorksheetId() {
        return worksheetId;
    }

    public void setWorksheetId(Integer worksheetId) {
        this.worksheetId = worksheetId;
    }

    public String getWorksheetContent() {
        return worksheetContent;
    }

    public void setWorksheetContent(String worksheetContent) {
        this.worksheetContent = worksheetContent == null ? null : worksheetContent.trim();
    }

    public Byte getWorksheetApproval() {
        return worksheetApproval;
    }

    public void setWorksheetApproval(Byte worksheetApproval) {
        this.worksheetApproval = worksheetApproval;
    }

    public Integer getWorksheetAdmin() {
        return worksheetAdmin;
    }

    public void setWorksheetAdmin(Integer worksheetAdmin) {
        this.worksheetAdmin = worksheetAdmin;
    }

    public Integer getWorksheetUser() {
        return worksheetUser;
    }

    public void setWorksheetUser(Integer worksheetUser) {
        this.worksheetUser = worksheetUser;
    }
}