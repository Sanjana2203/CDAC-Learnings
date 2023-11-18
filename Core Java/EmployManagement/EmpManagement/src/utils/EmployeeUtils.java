package utils;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;

import com.core.app.*;
import customExceptions.EmployyManagementException;

public class EmployeeUtils {

	public static String ValidatePhoneNumber(String phoneNumber) throws EmployyManagementException {
		String pNumber = phoneNumber;
		if (pNumber.matches("^[0-9]*$")) {
			return pNumber;
		} else
			throw new EmployyManagementException("Invalid Phonenumber format!!");
	}

	public static String ValidateAadharNumber(String aadharNumber) throws EmployyManagementException {
		String aNumber = aadharNumber;
		if (aNumber.matches(" ^\\\\S+$")) {
			return aNumber;
		} else
			throw new EmployyManagementException("Invalid Adadhar number format!!");
	}

	public static LocalDate ParseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}

	public static Employe ValidateallInputs(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber)
			throws EmployyManagementException {
		String eName = name;
		LocalDate eDate = ParseAndValidateDate(dateOfJoining);
		String pNumber = ValidatePhoneNumber(phoneNumber);
		String aNumber = ValidateAadharNumber(aadhaarNumber);

		return new Employe(eName, eDate, pNumber, aNumber);

	}
	
	public static PartTimeEmployee ValidatePartEmpInputs(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber, int hrlysalary)
			throws EmployyManagementException {
		String eName = name;
		LocalDate eDate = ParseAndValidateDate(dateOfJoining);
		String pNumber = ValidatePhoneNumber(phoneNumber);
		String aNumber = ValidateAadharNumber(aadhaarNumber);
		return new PartTimeEmployee(eName, eDate, pNumber, aNumber,hrlysalary);

	}
	
	
	public static FullTimeEmployee ValidateFEmpInputs(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber, int monthlysal)
			throws EmployyManagementException {
		String eName = name;
		LocalDate eDate = ParseAndValidateDate(dateOfJoining);
		String pNumber = ValidatePhoneNumber(phoneNumber);
		String aNumber = ValidateAadharNumber(aadhaarNumber);

		return new FullTimeEmployee(eName, eDate, pNumber, aNumber,monthlysal);

	}
	
	public static ArrayList<Employe> populateemployee() {
		ArrayList<Employe> emplist = new ArrayList<>();
		emplist.add(new FullTimeEmployee("prachit", LocalDate.parse("2023-06-05"), "987654321", "129876543219", 25000));
		
		emplist.add(new FullTimeEmployee("rajni", LocalDate.parse("2023-07-05"), "987345621", "129234567819", 30000));
		
		
		emplist.add(new FullTimeEmployee("noddy", LocalDate.parse("2023-08-05"), "934567821", "124567893219", 35000));
	
		
		emplist.add(new PartTimeEmployee("ronny", LocalDate.parse("2023-05-04"), "123456789", "987654321123", 450));
		
		emplist.add(new PartTimeEmployee("danny", LocalDate.parse("2023-03-04"), "123645789", "987345621123", 500));
		
		
		emplist.add(new PartTimeEmployee("manny", LocalDate.parse("2023-04-04"), "123476589", "987654122323", 350));
		
		return emplist;
		
	}
}