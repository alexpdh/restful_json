/**
 * Project Name:restful_json
 * File Name:EmployeeDaoTest.java
 * Package Name:com.pengdh.dao
 * Date:2016年12月11日上午2:49:29
 *
*/

package com.pengdh.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pengdh.entity.EmployeeEntity;

/**
 * ClassName:EmployeeDaoTest
 * Function: 员工信息查询测试类
 * Date:     2016年12月11日 上午2:49:29
 * @author   Administrator
 * @version
 * @since    JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class EmployeeDaoTest {
	@Autowired
	private EmployeeDao dao;
	/**
	 * 
	 * testQueryEmployList:查询所员工信息
	 * TODO
	 * @return void
	 * @throws
	 */
	@Test
	public void testQueryEmployList(){
		List<EmployeeEntity> list = dao.queryEmployList(0, 100);
		for(EmployeeEntity employees : list){
			System.out.println(employees.toString());
		}
	}
}

