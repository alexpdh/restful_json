package com.pengdh.service;

import java.util.List;

import com.pengdh.entity.EmployeeEntity;

public interface EmployeeService {

	List<EmployeeEntity> queryEmployList(int offset, int limit);

}
