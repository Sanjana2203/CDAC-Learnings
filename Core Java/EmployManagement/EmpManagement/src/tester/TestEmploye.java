package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import static utils.EmployeeUtils.*;
import com.core.app.Employe;
import com.core.app.FullTimeEmployee;
import com.core.app.PartTimeEmployee;

public class TestEmploye {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Employe> employes = populateemployee();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"Menu\r\n 1.Add fulltime emp\r\n 2.add part time emp\r\n 3.delete an emp by id\r\n "
							+ "4.Search emp details by aadhar number\r\n 5.Display all\r\n 6.sort by date\r\n 0.exit");
					switch (sc.nextInt()) {
					case 1://Add fulltime emp
						System.out.println("Enter the  full time emp details:name, dateOfJoining, phoneNumber, aadhaarNumber, monthlySalary ");
						FullTimeEmployee f1 =ValidateFEmpInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
						employes.add(f1);
						break;

					case 2:
						System.out.println("Enter the  Part time emp details:name, dateOfJoining, phoneNumber, aadhaarNumber, monthlySalary ");
						PartTimeEmployee p1 =ValidatePartEmpInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
						employes.add(p1);
						break;


					case 3:
						System.out.println("enter empId :");
						int tempid= sc.nextInt();
						Iterator<Employe> itr = employes.iterator();
						while(itr.hasNext()) {
							if(itr.next().getId()==tempid) {
								itr.remove();
								System.out.println("Emp deleated!!");
							}
						
						}
						
						break;

					case 4:
						System.out.println("enter the addhar no");
						String ad = sc.next();
						employes.stream().filter(a1->a1.getAadhaarNumber().equals(ad)).forEach(System.out::println);

						break;

					case 5:
						employes.stream().forEach(e->System.out.println(e));

						break;

					case 6:
						employes.stream().sorted(Comparator.comparing(Employe::getDateOfJoining)).forEach(System.out::println);
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
