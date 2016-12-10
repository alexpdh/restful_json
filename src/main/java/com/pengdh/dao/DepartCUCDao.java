package com.pengdh.dao;

import com.pengdh.entity.DepartCUCEntity;

public interface DepartCUCDao {
    int deleteByPrimaryKey(Long departId);

    int insert(DepartCUCEntity record);

    int insertSelective(DepartCUCEntity record);

    DepartCUCEntity selectByPrimaryKey(Long departId);

    int updateByPrimaryKeySelective(DepartCUCEntity record);

    int updateByPrimaryKey(DepartCUCEntity record);
}