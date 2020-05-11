package com.system.computer.service.impl;

import com.system.computer.mapper.AdminMapper;
import com.system.computer.mapper.UserMapper;
import com.system.computer.mapper.WorksheetMapper;
import com.system.computer.pojo.*;
import com.system.computer.service.WorksheetService;
import com.system.computer.vo.WorksheetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorksheetServiceImpl implements WorksheetService {
    @Autowired(required = false)
    WorksheetMapper worksheetMapper;
    @Autowired(required = false)
    AdminMapper adminMapper;
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public void createWorksheet(Worksheet worksheet) {
        worksheetMapper.insertSelective(worksheet);
    }

    @Override
    public void deleteWorksheet(Integer worksheetId) {
        worksheetMapper.deleteByPrimaryKey(worksheetId);
    }

    @Override
    public List<WorksheetVo> queryAllWorksheet(Integer adminId) {
        WorksheetExample worksheetExample = new WorksheetExample();
        worksheetExample.createCriteria().andWorksheetIdIsNotNull().andWorksheetAdminEqualTo(adminId);
        List<WorksheetVo> worksheetVos = new ArrayList<>();
        List<Worksheet> worksheets = worksheetMapper.selectByExample(worksheetExample);
        for (Worksheet worksheet : worksheets) {
            WorksheetVo worksheetVo = new WorksheetVo();
            worksheetVo.worksheet = worksheet;
            Admin admin = adminMapper.selectByPrimaryKey(worksheet.getWorksheetAdmin());
            User user = userMapper.selectByPrimaryKey(worksheet.getWorksheetUser());
            worksheetVo.admin = admin;
            worksheetVo.user = user;
            worksheetVos.add(worksheetVo);
        }
        return worksheetVos;
    }

    @Override
    public List<WorksheetVo> queryAllReturnWorksheet(Integer adminId) {
        WorksheetExample worksheetExample = new WorksheetExample();
        worksheetExample.createCriteria().andWorksheetAdminEqualTo(adminId).andWorksheetApprovalEqualTo(Byte.valueOf("0"));
        List<WorksheetVo> worksheetVos = new ArrayList<>();
        List<Worksheet> worksheets = worksheetMapper.selectByExample(worksheetExample);
        for (Worksheet worksheet : worksheets) {
            WorksheetVo worksheetVo = new WorksheetVo();
            worksheetVo.worksheet = worksheet;
            Admin admin = adminMapper.selectByPrimaryKey(worksheet.getWorksheetAdmin());
            User user = userMapper.selectByPrimaryKey(worksheet.getWorksheetUser());
            worksheetVo.admin = admin;
            worksheetVo.user = user;
            worksheetVos.add(worksheetVo);
        }
        return worksheetVos;
    }

    @Override
    public void returnWorkSheetById(Integer worksheetId) {
        Worksheet worksheet = new Worksheet();
        worksheet.setWorksheetApproval(Byte.valueOf("1"));
        worksheet.setWorksheetId(worksheetId);
        WorksheetExample worksheetExample = new WorksheetExample();
        worksheetExample.createCriteria().andWorksheetIdEqualTo(worksheetId).andWorksheetApprovalEqualTo(Byte.valueOf("0"));
        worksheetMapper.updateByExampleSelective(worksheet, worksheetExample);
    }

    @Override
    public List<WorksheetVo> queryAllWorksheetUser(Integer userId) {
        WorksheetExample worksheetExample = new WorksheetExample();
        worksheetExample.createCriteria().andWorksheetIdIsNotNull().andWorksheetUserEqualTo(userId);
        List<WorksheetVo> worksheetVos = new ArrayList<>();
        List<Worksheet> worksheets = worksheetMapper.selectByExample(worksheetExample);
        for (Worksheet worksheet : worksheets) {
            WorksheetVo worksheetVo = new WorksheetVo();
            worksheetVo.worksheet = worksheet;
            Admin admin = adminMapper.selectByPrimaryKey(worksheet.getWorksheetAdmin());
            User user = userMapper.selectByPrimaryKey(worksheet.getWorksheetUser());
            worksheetVo.admin = admin;
            worksheetVo.user = user;
            worksheetVos.add(worksheetVo);
        }
        return worksheetVos;
    }

    @Override
    public List<WorksheetVo> queryAllWorksheetUserBack(Integer userId) {
        WorksheetExample worksheetExample = new WorksheetExample();
        worksheetExample.createCriteria().andWorksheetIdIsNotNull().andWorksheetUserEqualTo(userId).andWorksheetApprovalEqualTo(Byte.valueOf("0"));
        List<WorksheetVo> worksheetVos = new ArrayList<>();
        List<Worksheet> worksheets = worksheetMapper.selectByExample(worksheetExample);
        for (Worksheet worksheet : worksheets) {
            WorksheetVo worksheetVo = new WorksheetVo();
            worksheetVo.worksheet = worksheet;
            Admin admin = adminMapper.selectByPrimaryKey(worksheet.getWorksheetAdmin());
            User user = userMapper.selectByPrimaryKey(worksheet.getWorksheetUser());
            worksheetVo.admin = admin;
            worksheetVo.user = user;
            worksheetVos.add(worksheetVo);
        }
        return worksheetVos;
    }
}
