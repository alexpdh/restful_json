package com.pengdh.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pengdh.dao.DepartDao;
import com.pengdh.entity.DepartEntity;
/**
 * 
 * ClassName: DepartDaoTest
 * Function: 部门信息查询测试类
 * date: 2016年12月11日 上午2:50:56
 *
 * @author Administrator
 * @version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class DepartDaoTest {
	@Autowired
	private DepartDao dao;
	/**
	 * 
	 * testQueryAllDemp:查询所有部门信息
	 * TODO
	 * @return void
	 * @throws
	 */
	@Test
	public void testQueryAllDemp(){
		List<DepartEntity> list = dao.queryAllDepart(0, 100);
		for(DepartEntity depart : list){
			System.out.println(depart.toString());
		}
		System.out.println("--------------------------");
	}
}
