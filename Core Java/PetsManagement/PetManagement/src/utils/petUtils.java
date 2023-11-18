package utils;

import java.util.HashMap;

import com.app.core.Category;
import com.app.core.Order;
import com.app.core.Pet;

import customeExceptions.*;

public class petUtils {

	public static boolean authenticateCustomer(String userName, String password) {
		if (userName.equalsIgnoreCase("c1") && password.equalsIgnoreCase("c1")) {
			return true;
		}
		return false;
	}
	
	public static boolean authenticateAdmin(String userName, String password) {
		if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return true;
		}
		return false;
	}

	public static void checkPetId(Integer id,HashMap<Integer, Pet>pets) throws InvalidInputException {
		if (pets.containsKey(id)) {
			System.out.println("Valid Pet Id");
		}
		else
			throw new InvalidInputException("Incorrect Id");
	}
	
	public static Order checkOrderId(Integer id,HashMap<Integer, Order>orders) throws AuthenticationException {
		if(orders.get(id)!=null) {
			return orders.get(id);
		}
		throw new AuthenticationException("Invalid Order Id");
	}
	
	public static void updateOrderStock(Integer id,int qty,HashMap<Integer, Pet>pets) {
		Pet p = pets.get(id);
		p.setStocks(p.getStocks()-qty);
		System.out.println("Stocks Updated");
	}

	public static HashMap<Integer, Pet>populatemap(){
		HashMap<Integer,Pet>pets = new HashMap<Integer,Pet>();
		//int petId, String name, Category category, int unitPrice, int stocks
		Pet p1 = new Pet(101, "Golden Retiver", Category.DOG, 25000, 5);
		Pet p2 = new Pet(102, "Gold Fish", Category.FISH, 5000, 5);
		Pet p3 = new Pet(103, "Snow Bell", Category.CAT, 15000, 7);
		Pet p4 = new Pet(104, "Bunny", Category.RABBIT, 6000, 8);
		Pet p5 = new Pet(105, "Puddle", Category.DOG, 35000, 4);
		Pet p6 = new Pet(106, "Shark", Category.FISH, 7000, 3);
		pets.put(p1.getPetId(), p1);
		pets.put(p2.getPetId(), p2);
		pets.put(p3.getPetId(), p3);
		pets.put(p4.getPetId(), p4);
		pets.put(p5.getPetId(), p5);
		pets.put(p6.getPetId(), p6);
		return pets;
	}

}
