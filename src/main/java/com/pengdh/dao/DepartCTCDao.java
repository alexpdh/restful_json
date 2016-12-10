package com.pengdh.dao;

import com.pengdh.entity.DepartCTCEntity;

public interface DepartCTCDao {
    int deleteByPrimaryKey(Long departId);

    int insert(DepartCTCEntity record);

    int insertSelective(DepartCTCEntity record);

    DepartCTCEntity selectByPrimaryKey(Long departId);

    int updateByPrimaryKeySelective(DepartCTCEntity record);

    int updateByPrimaryKey(DepartCTCEntity record);
}