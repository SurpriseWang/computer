package com.system.computer.service;

import com.system.computer.pojo.Worksheet;
import com.system.computer.vo.WorksheetVo;

import java.util.List;

public interface WorksheetService {
    void createWorksheet(Worksheet worksheet);

    void deleteWorksheet(Integer worksheetId);

    List<WorksheetVo> queryAllWorksheet(Integer adminId);

    List<WorksheetVo> queryAllReturnWorksheet(Integer adminId);

    void returnWorkSheetById(Integer worksheetId);

    List<WorksheetVo> queryAllWorksheetUser(Integer userId);

    List<WorksheetVo> queryAllWorksheetUserBack(Integer userId);
}
