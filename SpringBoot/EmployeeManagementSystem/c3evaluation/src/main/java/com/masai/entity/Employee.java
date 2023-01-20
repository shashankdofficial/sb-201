package com.masai.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String empDept;
	
	public void setEmpName(String empName2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmpDept(String empDept2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
