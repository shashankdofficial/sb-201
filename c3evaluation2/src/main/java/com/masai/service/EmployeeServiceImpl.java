package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.exceptions.UserDoesNotExist;
import com.masai.exceptions.UserNameAlreadyExist;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empDao;

	@Override
	public ResponseEntity<Employee> addEmployee(Employee emp) {
		Employee empl = empDao.findById(emp.getEmpId());
		
		if(empl != null) throw new UserNameAlreadyExist("Id is already Registered");
		empDao.save(emp);
		
		ResponseEntity<Employee> re = new ResponseEntity<>(emp, HttpStatus.ACCEPTED);
		return re;
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Employee emp) {
		Employee empl = empDao.findById(emp.getEmpId());
		
		if(empl == null) throw new UserDoesNotExist("Id is Not Registered");
		empDao.save(empl);
		ResponseEntity<Employee> re = new ResponseEntity<>(empl, HttpStatus.OK);
		return re;
	}

	@Override
	public ResponseEntity<Employee> deleteEmployee(Employee emp) {
		Employee empl = empDao.findById(emp.getEmpId());
		
		if(empl == null) throw new UserDoesNotExist("Id is Not Registered");
		
		empDao.delete(empl);
		
		ResponseEntity<Employee> re = new ResponseEntity<>(empl, HttpStatus.OK);
		return re;
	}

	
}
