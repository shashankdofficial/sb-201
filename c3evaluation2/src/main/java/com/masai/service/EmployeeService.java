package com.masai.service;

import org.springframework.http.ResponseEntity;

import com.masai.entity.Employee;

public interface EmployeeService {

	public ResponseEntity<Employee> addEmployee(Employee emp);
	
	public ResponseEntity<Employee> updateEmployee(Employee emp);
	
	public ResponseEntity<Employee> deleteEmployee(Employee emp);
}
