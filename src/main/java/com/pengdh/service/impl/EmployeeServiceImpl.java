package com.pengdh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengdh.dao.EmployeeDao;
import com.pengdh.entity.EmployeeEntity;
import com.pengdh.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	@Override
	public List<EmployeeEntity> queryEmployList(int offset, int limit) {
		return empDao.queryEmployList(offset,limit);
	}

}
