package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao empdao;
	
	@Override
	public Employee addEmplpoyee(Employee emp) {
		Employee employee = empdao.save(emp);
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Integer id, String empName, String empDept) {
		Optional<Employee> employee = empdao.findById(id);
		Employee emp= employee.get();
		emp.setEmpName(empName);
		emp.setEmpDept(empDept);
		return empdao.save(emp);
	}

	@Override
	public Employee removeEmployee(Integer id) {
		Optional<Employee> employee = empdao.findById(id);
		Employee emp = employee.get();
		empdao.delete(emp);
		return emp;
	}

	@Override
	public Employee viewEmployee(Integer id) {
		Optional<Employee> employee = empdao.findById(id);
		Employee emp = employee.get();
		return emp;
	}

	@Override
	public List<Employee> viewAllEmployees() {
		List<Employee> employee = empdao.findAll();
		return employee;
	}





}
