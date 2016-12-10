package com.pengdh.service;

import java.util.List;

import com.pengdh.entity.DepartEntity;

public interface DepartService {

	List<DepartEntity> queryAllDepart(int offset, int limit);
}
