package com.app.core;

import java.time.LocalDate;

public class Task {
//taskId, taskName, description, taskDate, status, active. 
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active = true;
	private static int idGenerator =0;

	
	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId = ++idGenerator;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = Status.PENDING;
		this.active = true;
	}


	

	public int getTaskId() {
		return taskId;
	}




	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}




	public String getTaskName() {
		return taskName;
	}




	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public LocalDate getTaskDate() {
		return taskDate;
	}




	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}




	public Status getStatus() {
		return status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}




	public boolean isActive() {
		return active;
	}




	public void setActive(boolean active) {
		this.active = active;
	}




	public static int getIdGenerator() {
		return idGenerator;
	}




	public static void setIdGenerator(int idGenerator) {
		Task.idGenerator = idGenerator;
	}




	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	
}
