package com.core.app;

import java.time.LocalDate;

public class Employe {
	public int id;
	private String name;
	private LocalDate dateOfJoining;
	private String PhoneNumber;
	private String aadhaarNumber;
	public static int idGen = 0;

	public Employe(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber) {
		super();
		this.id=++idGen;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		PhoneNumber = phoneNumber;
		this.aadhaarNumber = aadhaarNumber;
	}

	public  int getId() {
		return id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
//
//	@Override
//	public String toString() {
//		return "Employe [id =" + id + " name=" + name + ", dateOfJoining=" + dateOfJoining + ", PhoneNumber="
//				+ PhoneNumber + ", aadhaarNumber=" + aadhaarNumber + "]";
//	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

}
