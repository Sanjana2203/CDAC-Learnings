package tester;

import static utils.petUtils.authenticateAdmin;
import static utils.petUtils.authenticateCustomer;
import static utils.petUtils.*;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Order;
import com.app.core.Pet;
import com.app.core.Status;

import customeExceptions.AuthenticationException;
import customeExceptions.AuthorizationException;

public class PetManagement {

	public static void main(String[] args) {
		boolean exit = false;
		HashMap<Integer, Pet> pets = populatemap();
		HashMap<Integer, Order> orders = new HashMap<>();
		boolean customerAuthincated = false;
		boolean adminAuthincated = false;
		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {

				try {
					System.out.println("1.Login\r\n"
							+ "2.Add new Pet\r\n" 
							+ "3.Update Pet details (Admin only functionality)\r\n"
							+ "4.Display all available pets\r\n" 
							+ "5.Order a Pet\r\n"
							+ "6.Check order status by Order Id\r\n"
							+ "7.Update order status (Admin only functionality)\r\n" + "0.Exit");

					switch (sc.nextInt()) {

					case 1://Login
						System.out.println("Enter UserName and Password");
						String userName = sc.next();
						String password = sc.next();
						customerAuthincated = authenticateCustomer(userName, password);
						adminAuthincated = authenticateAdmin(userName, password);
						if (adminAuthincated || customerAuthincated) {
							System.out.println("Login Sucessful!!");
						} else
							throw new AuthenticationException("Invalid UserName and Password");
						break;
						
					case 2://2.Add new Pet
						if (adminAuthincated ) {
							System.out.println(
							"Enter the Pet details in following order : petId, name, category, unitPrice, stocks");
							Pet p = new Pet(sc.nextInt(), sc.next(), Category.valueOf(sc.next()), sc.nextInt(),
									sc.hashCode());
							pets.put(p.getPetId(), p);
						} else
							throw new AuthorizationException("You are not authorized to use this functionality!!");
						break;

					case 3://3.Update Pet details 
						if (adminAuthincated) {
							System.out.println("Enter the PetId");
							int pId =sc.nextInt();
							checkPetId(pId, pets);
							System.out.println(
									"Enter the Pet details in following order : name, category, unitPrice, stocks");
							Pet p=pets.get(pId);
							p.setUnitPrice(sc.nextInt());
							p.setStocks(sc.nextInt());
							System.out.println(p);
						} else
							throw new AuthorizationException("You are not authorized to use this functionality!!");
						break;
					
					case 4:// display
						if (adminAuthincated || customerAuthincated) {
							System.out.println("Following are the Pet Details:");
							pets.values().stream().forEach(pet -> System.out.println(pet));
						}
						else
							throw new AuthorizationException("You have no Authorization to see the details, Login to use this functionality");
						break;

					case 5://Order a Pet
						if(customerAuthincated|| adminAuthincated) {
							System.out.println("Enter the Pet Id and the quantity :");
							int pId =sc.nextInt();
							int pQuantity = sc.nextInt();
							checkPetId(pId, pets);
							if(pets.get(pId).getStocks()>pQuantity) {
							Order o = new Order(pId, pQuantity, Status.PLACED);
							orders.put(o.getOrderId(), o);
							updateOrderStock(pId, pQuantity, pets);
							System.out.println("Your orderId is : "+o.getOrderId());
							}
							else
								System.out.println("Out of stock!!!");
						}
						else
						throw new AuthenticationException("Login to order!!");
						break;
						
					case 6://4.Check order status by Order Id
						if(customerAuthincated) {
						System.out.println("Enter the order Id ");
						int orderId = sc.nextInt();
						Order o = orders.get(orderId);
						System.out.println(o.getStatus());
						}
						else
						throw new AuthenticationException("Login to check status!!");
						break;

					case 7://5.Update order status (Admin only functionality)
						if(adminAuthincated) {
							System.out.println("Enter The Order Id");
							int oid =sc.nextInt();
							Order o1 = orders.get(oid);
							o1.setStatus(Status.COMPLETED);
							System.out.println("Order status Updated!!");
							/*
        orders.computeIfPresent(oid, (k, v) -> {
            v.setStatus(Status.COMPLETED);
            return v;
        });
        System.out.println("Order status Updated!!");*/
						}
						else
						throw new AuthorizationException("You are not authorized to use this functionality!!");
						break;

					case 0:
						exit=true;
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();

				}
			}

		}

	}

}
