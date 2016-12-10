package com.pengdh.dao;

import com.pengdh.entity.DepartCMCEntity;

public interface DepartCMCDao {
    int deleteByPrimaryKey(Long departId);

    int insert(DepartCMCEntity record);

    int insertSelective(DepartCMCEntity record);

    DepartCMCEntity selectByPrimaryKey(Long departId);

    int updateByPrimaryKeySelective(DepartCMCEntity record);

    int updateByPrimaryKey(DepartCMCEntity record);
}