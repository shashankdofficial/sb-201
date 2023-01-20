package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.entity.Employee;


@Service
public interface EmployeeService {
	 public Employee addEmplpoyee(Employee emp);

	    public Employee updateEmployee(Integer id, String empName, String empDept);

	    public Employee removeEmployee(Integer id);

	    public Employee viewEmployee(Integer id);

	    public List<Employee> viewAllEmployees();
}
