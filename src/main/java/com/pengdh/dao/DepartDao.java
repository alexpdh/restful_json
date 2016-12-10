package com.pengdh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pengdh.entity.DepartEntity;

public interface DepartDao {
	List<DepartEntity> queryAllDepart(@Param("offset") int offset, @Param("limit") int limit);
	
    int deleteByPrimaryKey(Long departId);

    int insert(DepartEntity record);

    int insertSelective(DepartEntity record);

    DepartEntity selectByPrimaryKey(Long departId);

    int updateByPrimaryKeySelective(DepartEntity record);

    int updateByPrimaryKey(DepartEntity record);
}