package com.pengdh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengdh.dao.DepartDao;
import com.pengdh.entity.DepartEntity;
import com.pengdh.service.DepartService;
@Service
public class DepartServiceImpl implements DepartService{
	@Autowired
	private DepartDao departDao;
	@Override
	public List<DepartEntity> queryAllDepart(int offset, int limit) {
		return departDao.queryAllDepart(offset, limit);
	}

}
