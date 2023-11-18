package com.core.app;

import java.time.LocalDate;

public class PartTimeEmployee extends Employe {
private int hourlyPayment;


	public PartTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,int hourlyPayment) {
		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.hourlyPayment=hourlyPayment;
		
	}


	public int getHourlyPayment() {
		return hourlyPayment;
	}


	public void setHourlyPayment(int hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}


	@Override
	public String toString() {
		return "PartTimeEmployee [id="+id+ "hourlyPayment=" + hourlyPayment + ", getName()=" + getName() + ", getDateOfJoining()="
				+ getDateOfJoining() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAadhaarNumber()="
				+ getAadhaarNumber() + " ]";
	}

}
