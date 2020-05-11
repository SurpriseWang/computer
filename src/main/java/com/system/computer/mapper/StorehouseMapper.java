package com.system.computer.mapper;

import com.system.computer.pojo.Storehouse;
import com.system.computer.pojo.StorehouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorehouseMapper {
    int countByExample(StorehouseExample example);

    int deleteByExample(StorehouseExample example);

    int deleteByPrimaryKey(Integer storehouseId);

    int insert(Storehouse record);

    int insertSelective(Storehouse record);

    List<Storehouse> selectByExample(StorehouseExample example);

    Storehouse selectByPrimaryKey(Integer storehouseId);

    int updateByExampleSelective(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByExample(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByPrimaryKeySelective(Storehouse record);

    int updateByPrimaryKey(Storehouse record);
}