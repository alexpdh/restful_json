package com.pengdh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pengdh.entity.EmployeeEntity;

public interface EmployeeDao {
    int deleteByPrimaryKey(Long empId);

    int insert(EmployeeEntity record);

    int insertSelective(EmployeeEntity record);

    EmployeeEntity selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(EmployeeEntity record);

    int updateByPrimaryKey(EmployeeEntity record);

	List<EmployeeEntity> queryEmployList(@Param("offset") int offset, @Param("limit") int limit);
}