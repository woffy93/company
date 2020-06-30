package it.francesco.presentation.domain.dto;

import it.francesco.presentation.domain.dto.task.Task;

import java.util.HashSet;
import java.util.Set;

public class DevDto extends Employee{
    private Set<Task> assignedTasks;

    public DevDto(String cf, int ral, BadgeDto badge) {
        super(cf, ral, badge);
        this.assignedTasks = new HashSet<>();
    }

    public Set<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(Set<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }
}
