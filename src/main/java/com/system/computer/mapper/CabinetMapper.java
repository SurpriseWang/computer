package com.system.computer.mapper;

import com.system.computer.pojo.Cabinet;
import com.system.computer.pojo.CabinetExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CabinetMapper {
    int countByExample(CabinetExample example);

    int deleteByExample(CabinetExample example);

    int deleteByPrimaryKey(Integer cabinetId);

    int insert(Cabinet record);

    int insertSelective(Cabinet record);

    List<Cabinet> selectByExample(CabinetExample example);

    Cabinet selectByPrimaryKey(Integer cabinetId);

    int updateByExampleSelective(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    int updateByExample(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    int updateByPrimaryKeySelective(Cabinet record);

    int updateByPrimaryKey(Cabinet record);
}