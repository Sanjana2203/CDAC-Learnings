package utils;

import java.util.HashMap;
import static exceptions.CricketExceptions.*;
import com.app.core.Cricketer;

import exceptions.CricketExceptions;

public class cricketUtils {

	public static String checkNames(String name,HashMap<String, Cricketer>cricketers) throws CricketExceptions {
		if (!cricketers.containsValue(name)) 
			return name;
		else 
			throw new CricketExceptions("Duplicate found!!!");
		
		
	}
	
	
	public static String validateNames(String name,HashMap<String, Cricketer>cricketers) throws CricketExceptions {
		if (cricketers.containsValue(name)) 
			return name;
		else 
			throw new CricketExceptions("Invalid Name");
		
		
	}
	
	
	public static HashMap<String, Cricketer> populatecricketers() {
		HashMap<String, Cricketer> cricketers = new HashMap<>();
		//String name, int age, String email_id, String phone, int rating
		Cricketer c1 = new Cricketer("Virat", 30, "Virat@Kolhi", "987654321", 5);
		Cricketer c2 = new Cricketer("Rohit", 35, "Rohit@123", "987645321", 5);
		Cricketer c3 = new Cricketer("KL Rahul", 31, "KL@123", "987654321", 4);
		Cricketer c4 = new Cricketer("RAju", 15, "Raj@123", "987456321", 2);
		Cricketer c5 = new Cricketer("Pintu", 16, "Pintu@123", "987345621", 3);
		Cricketer c6 = new Cricketer("Pappu", 17, "Pappu@123", "945678321", 1);
		cricketers.put(c1.getName(), c1);
		cricketers.put(c2.getName(), c2);
		cricketers.put(c3.getName(), c3);
		cricketers.put(c4.getName(), c4);
		cricketers.put(c5.getName(), c5);
		cricketers.put(c6.getName(), c6);
		
		return cricketers;
	}
}
