package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
@Service
public class Empservice {
	@Autowired
 public void AddEmp(Employee e)
 {
	 repo.save(e);
 }
	public List<Employee>getAllEmp()
	{
		return repo.finalAll();
	}
	public Employee getEMpById(int id)
	
	{
		optional<Employee> e=repo.findById(id);
		if (e.isPresent())
		{
		return e.get();
		}
		return null;
	
	}
	public void deleteEMp(int id) {
		repo.deleteById(id);
	}
}
