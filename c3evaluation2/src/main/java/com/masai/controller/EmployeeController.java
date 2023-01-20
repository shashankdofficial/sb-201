package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Employee;
import com.masai.service.EmployeeServiceImpl;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empService;
	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee emp){
		return empService.addEmployee(emp);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestParam int EmpId, @RequestBody Employee emp){
		return empService.updateEmployee(emp);
	}
	
	public ResponseEntity<Employee> deleteEmployee(@RequestBody Employee emp){
		return empService.deleteEmployee(emp);
	}
}
