package com.masai;

public class ServiceBean {

	private DaoBean dao;

	public void setDao(DaoBean dao) {
		this.dao = dao;
	}
	
	public void calculateIntrest() {
		dao.findAccount();
		
		System.out.println("Intrest calculated in Service Layer");
	}
}
