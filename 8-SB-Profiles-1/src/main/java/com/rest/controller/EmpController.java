package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.entity.Employee;
import com.rest.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService serv;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/reg")
	public String regPage(ModelMap model)
	{
		Employee emp=new Employee();
		model.put("emp", emp);
		values(model);
		return "register";
	}
	@RequestMapping("/register")
	public String regEmp(@ModelAttribute Employee emp,ModelMap model)
	{
		serv.saveUser(emp);
		return "success";
	}
	
	
	public void values(ModelMap model)
	{
		List<String> desg=List.of("ceo","projectManager","teamLeader");
		List<String> qual=List.of("mba","mtech","btech");
		model.addAllAttributes(qual);
		model.addAllAttributes(desg);
	}
}
