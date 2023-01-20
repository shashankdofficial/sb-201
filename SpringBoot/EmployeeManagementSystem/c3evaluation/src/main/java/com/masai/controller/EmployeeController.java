package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Employee;
import com.masai.exception.InvalidId;
import com.masai.exception.NullValueException;
import com.masai.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/")
	public Employee addEmployeeHandler(@RequestBody Employee employee) {
		Employee emp= empService.addEmplpoyee(employee);
		if(emp==null){
				throw new NullValueException("Value not found");
		}else {
			return emp;
		}

	}
	
	@GetMapping("/{id}")
	public Employee viewEmployeeHandler(@PathVariable("id") Integer id) {
		if (id==null){
			throw new InvalidId("Invalid URI");
		}
		else {
			Employee emp=empService.viewEmployee(id);
			if (emp==null){
				throw new NullValueException("Value not found");
			}
			return emp;
		}

	}
	@DeleteMapping("/{id}")
	public String removeEmployeeHandler(@PathVariable("id")Integer id) {
		if(id==null) {
			throw new InvalidId("Invalid Id");
		}
		else {
			empService.removeEmployee(id);
		}
		return "Employee terminated";
	}
	@PutMapping("/{id}")
	public Employee updateEmployeeHandler(@PathVariable("id")Integer id,@RequestBody String empName, @RequestBody String empDept) {
		return empService.updateEmployee(id, empName, empDept);
	}
	
	@GetMapping("/all")
	public List<Employee> viewAllEmployeeHandler(){
		List<Employee>emp=empService.viewAllEmployees();
		if(emp.size()==0){
			throw new NullValueException("Value not found");
		}
		else {
			return emp;
		}
	}
}
