package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.Empservice;
@Controller

public class EmployeeController {
	@Autowired
	private Empservice service;

	@GetMapping("/")
	public String home(Model m) {
	List<Employee>emp=service.getAllEmp();
	m.addAttribute("emp");
	{
		return "index";
	}
	@Getmapping("/Add_Emp")
	public String Add_EmpForm()
	{
		return"Add_Emp"
	}
	@PostMapping("/register")
	public String empReister(@ModelAttribute Employee e HttpSession session)
	
	
	{
		System.out.println(e);
		service.AddEmp(e);
		session.setAttribute("msg", "employee add sucessfully");
		
		return"redirect:/";
				
	}
	@GetMapping("/edit/{id}")
	public String edit(@pathvariable int id)
	{
		Employee e=service.getEMpById(id);
		m.addAttribute("emp",e);
	
		return "edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session)
	{
		service.AddEmp(e);
		session.setAttribute("msg",Emp data updaye sucessfully..");
				
				return"redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteEMp(@PathVeriable int id)
	{
		return"redirect:/";
		
	}
}
