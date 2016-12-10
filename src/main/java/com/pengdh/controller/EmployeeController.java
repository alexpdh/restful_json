package com.pengdh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pengdh.entity.EmployeeEntity;
import com.pengdh.service.EmployeeService;

@Controller
@RequestMapping(value="/employs")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value="/employlist",method=RequestMethod.GET)
	public String queryEmployList(Model model,Integer offset,Integer limit){
		offset = offset == null ? 0 : offset;
		limit = limit == null ? 50 : limit;
		List<EmployeeEntity> list = empService.queryEmployList(offset,limit);
		for(EmployeeEntity employees : list){
			System.out.println(employees.toString());
		}
		model.addAttribute("employlist", list);
		return "employlist";
		
	}
}
