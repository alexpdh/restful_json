package com.pengdh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pengdh.dto.BaseResult;
import com.pengdh.entity.DepartEntity;
import com.pengdh.service.DepartService;

@Controller
@RequestMapping(value="/departs")
public class DepartController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DepartService departService;
	
	@RequestMapping(value="/queryall",method=RequestMethod.GET)
	public String queryAllDepart(Model model,Integer offset,Integer limit){
		logger.info("invoke:/department/getall");
		offset = offset == null ? 0 : offset;
		limit = limit == null ? 50 : limit;
		List<DepartEntity> list = departService.queryAllDepart(offset, limit);
		for(DepartEntity departs : list){
			System.out.println(departs.toString());
		}
		model.addAttribute("departlist",list);
		return "departlist";
	}
	
	@RequestMapping(value="{departId}/departDetail", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseResult<Object> queryDepartDetail(@PathVariable("departId") String departId) {
		logger.info("invoke:/"+departId+"departDetail");
		
		return null;
	}
}
