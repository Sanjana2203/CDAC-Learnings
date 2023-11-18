package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.Status;
import com.app.core.Task;

public class TaskUtils {

	public static LocalDate validateDate(String date) {
		return LocalDate.parse(date);
	}

	public static Task validateTask(String taskName, String description, String taskDate) {
		LocalDate tskDate = validateDate(taskDate);

		return new Task(taskName, description, tskDate);

	}

	public static HashMap<Integer, Task> populateTask() {
		HashMap<Integer, Task> tasks = new HashMap<>();
		// String taskName, String description, LocalDate taskDate, Status
		Task t1 = new Task("Study", "not good", LocalDate.parse("2023-10-15"));
		Task t2 = new Task("Play", "Leasure time", LocalDate.parse("2023-10-16"));
		Task t3 = new Task("Dance", "Hobby", LocalDate.parse("2023-10-06"));
		Task t4 = new Task("Singing", "passion", LocalDate.parse("2023-10-17"));
		Task t5 = new Task("Sudoku", "refreshment", LocalDate.parse("2023-10-06"));
		Task t6 = new Task("Chekers", "socializing", LocalDate.parse("2023-05-06"));

		tasks.put(t1.getTaskId(), t1);
		tasks.put(t2.getTaskId(), t2);
		tasks.put(t3.getTaskId(), t3);
		tasks.put(t4.getTaskId(), t4);
		tasks.put(t5.getTaskId(), t5);
		tasks.put(t6.getTaskId(), t6);
		return tasks;
	}

}
