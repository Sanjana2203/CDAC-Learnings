package com.core.app;

import java.time.LocalDate;

public class FullTimeEmployee extends Employe {
	
private int monthlySalary ;

public FullTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,int monthlySalary ) {
	super(name, dateOfJoining, phoneNumber, aadhaarNumber);
	this.monthlySalary =monthlySalary;
}




public int getMonthlySalary() {
	return monthlySalary;
}




public void setMonthlySalary(int monthlySalary) {
	this.monthlySalary = monthlySalary;
}




@Override
public String toString() {
	return "FullTimeEmployee [id=" +id+"monthlySalary=" + monthlySalary + ", getName()=" + getName() + ", getDateOfJoining()="
			+ getDateOfJoining() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAadhaarNumber()="
			+ getAadhaarNumber() + "]";
}
	
		
	}


