package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Employee;
import com.springboot.demo.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmp(){
		
		return empService.getAllEmp();
	}
	
	@PostMapping("/employees")
	public Employee createEmp(@RequestBody Employee emp) {
		
		return empService.createEmp(emp);
	}
	
	@DeleteMapping("/employees/{empId}")
	public void deleteEmp(@PathVariable Long empId) {
		empService.deleteEmp(empId);
	}
}
