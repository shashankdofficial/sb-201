package com.masai;

public class PresentationBean {

	private ServiceBean service;
	
	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	//Business Logic
	public void present() {
		service.calculateIntrest();
		
		System.out.println("Presenting the calculated Intrest...");
	}
}
