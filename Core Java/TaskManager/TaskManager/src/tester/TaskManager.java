package tester;

import static utils.TaskUtils.populateTask;
import static utils.TaskUtils.validateTask;

import exceptions.CustomException;
import exceptions.CustomException.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Status;
import com.app.core.Task;
public class TaskManager {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			HashMap<Integer, Task> tasks = populateTask();
			
			while(!exit) {
			System.out.println("1. Add New Task \r\n"
					+ "2. Delete a task\r\n"
					+ "3. Update task status \r\n"
					+ "4. Display all pending tasks\r\n"
					+ "5. Display all pending tasks for today\r\n"
					+ "6. Display all tasks sorted by taskDate\r\n"
					+ "7. Display all tasks\r\n"
					+ "0.Exit");
			try {
			switch (sc.nextInt()) {
			
				
			case 1:
				System.out.println("Enter taskName,description and taskDate");
				Task task =  validateTask(sc.next(), sc.next(), sc.next());
				tasks.put(task.getTaskId(), task);
				System.out.println("Task added Sucessfully!!!");
				System.out.println("Task id is"+task.getTaskId());
				break;
				
			case 2://deletetask
				System.out.println("Enter the task id to be deleted");
				int id1= sc.nextInt();
						if(tasks.containsKey(id1)) {
				tasks.remove(id1);
						}else
							throw new CustomException("Invalid id!!");
						
			case 3:
				System.out.println("Enter the id and status For task updation");
				task = tasks.get(sc.next());
				task.setStatus(Status.valueOf(sc.next().toUpperCase())); 
				
				break;
				
			case 4:
				for(Task t: tasks.values()) {
					if(t.getStatus().equals(Status.PENDING))
					System.out.println(t);
				}
				break;
	
			
			case 5://pending task for today
				for(Task t: tasks.values()) {
					if(t.getTaskDate().isEqual(LocalDate.now())&& t.getStatus().equals(Status.PENDING))
					System.out.println(t);
				}
				break; 
				
			case 6://sorted by task date
				System.out.println("Tasks sorted by task dates are:");
				tasks.values().stream().sorted(Comparator.comparing(Task::getTaskDate)).forEach(i->System.out.println(i));
	
				break;
			case 7:
				for(Task t: tasks.values())
				System.out.println(t);
				break;
	
			case 0:
				exit =true;
				break;

			
			}
			}
			catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
				
			
		}

	}


}
}
