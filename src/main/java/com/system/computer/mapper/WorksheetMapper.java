package com.system.computer.mapper;

import com.system.computer.pojo.Worksheet;
import com.system.computer.pojo.WorksheetExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorksheetMapper {
    int countByExample(WorksheetExample example);

    int deleteByExample(WorksheetExample example);

    int deleteByPrimaryKey(Integer worksheetId);

    int insert(Worksheet record);

    int insertSelective(Worksheet record);

    List<Worksheet> selectByExample(WorksheetExample example);

    Worksheet selectByPrimaryKey(Integer worksheetId);

    int updateByExampleSelective(@Param("record") Worksheet record, @Param("example") WorksheetExample example);

    int updateByExample(@Param("record") Worksheet record, @Param("example") WorksheetExample example);

    int updateByPrimaryKeySelective(Worksheet record);

    int updateByPrimaryKey(Worksheet record);
}