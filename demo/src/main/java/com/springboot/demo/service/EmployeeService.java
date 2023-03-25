package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.model.Employee;
import com.springboot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}

	public Employee createEmp(Employee emp) {
		return repo.save(emp);
	}
	
	public void deleteEmp(Long empId) {
		repo.deleteById(empId);
	}
}
