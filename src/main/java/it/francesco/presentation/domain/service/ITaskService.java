package it.francesco.presentation.domain.service;

import it.francesco.presentation.domain.dto.Employee;
import it.francesco.presentation.domain.dto.PMDto;
import it.francesco.presentation.domain.dto.task.Task;

public interface ITaskService {
    public void createTask(PMDto projectManager);
    public void advanceTaskStatus(Employee employee, Task task); //anyone can advance a task status
}
