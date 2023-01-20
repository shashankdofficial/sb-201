package com.masai;

public class ServiceBean {

	private DAOBean dao;
	
	public void setDao(DAOBean dao) {
		this.dao = dao;
	}
	
	//Business Logic
	public void calculateIntrest() {
		dao.findaccount();
		System.out.println("Intrest calculated...");
	}
}
