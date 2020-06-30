package it.francesco.presentation.domain.dto;

import it.francesco.presentation.domain.dto.task.Task;

import java.util.Set;

public class ProjectDto {
    private String name;
    private Set<Task> tasks;

    public ProjectDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
