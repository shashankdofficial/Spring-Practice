package com.masai;

public class PresentationBean {

	private ServiceBean service;

	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	public void present() {
		service.calculateIntrest();
		
		System.out.println("Presenting the calculated Intrest in Presentation Layer");
	}
}
