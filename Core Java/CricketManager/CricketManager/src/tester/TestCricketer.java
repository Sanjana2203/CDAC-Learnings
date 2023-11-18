package tester;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import static utils.cricketUtils.*;
import com.app.core.Cricketer;

public class TestCricketer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Boolean exit = false;
			HashMap<String, Cricketer> cricketers = populatecricketers();
			while (!exit) {
				try {
					System.out.println("Choose from the following:\r\n"
							+ "1.Accept minimum 5 Cricketers in the collection.\r\n"
							+ "2.Modify Cricketer's rating\r\n"
							+ "3.Search Cricketer by name\r\n" 
							+ "4.Display all Cricketers added in collection.\r\n"
							+ "5.Display All Cricketers in sorted form by rating.\r\n" + "0.Exit\r\n");

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter the cricketer details in following order:Name, Age, Email_id, Phone, Rating");
						String name = checkNames(sc.next(), cricketers);
						Cricketer cricketer = new Cricketer(name, sc.nextInt(), sc.next(), sc.next(),
								sc.nextInt());
						cricketers.put(cricketer.getName(), cricketer);
						break;

					case 2:
						System.out.println("Enter the Cricketer name and ratings to be changed");
						 String name1 = sc.next();
						int ratings = sc.nextInt();
						cricketers.values().stream().filter(p5->p5.getName().equals(name1))
						.forEach(p6->{p6.setRating(ratings);System.out.println(p6);});
						break;

					case 3:
						System.out.println("Enter the name, Searching cricketer by nam...");
						cricketers.values().stream().filter(p->p.getName().equals(sc.next())).forEach(p4->System.out.println(p4));

						break;

					case 4:
						System.out.println("All Cricketers added in Listr are:");
						cricketers.values().stream().forEach(p1-> System.out.println(p1));
						break;

					case 5:
						System.out.println("Sorting cricketers by ratings :");
						cricketers.values().stream().sorted(Comparator.comparing(Cricketer::getRating)).forEach(p2->System.out.println(p2));

						break;

					case 0:
						exit = true;
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
