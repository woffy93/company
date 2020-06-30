package it.francesco.presentation.domain.dto.task;


import it.francesco.presentation.domain.dto.ProjectDto;

import java.util.Date;

public class Task {
    private Integer id;
    private Date deadline;
    private String description;
    private TaskStatusEnum status;
    private ProjectDto project;

    public Task(Date deadline, String description, TaskStatusEnum status, ProjectDto project, Integer id) {
        this.deadline = deadline;
        this.description = description;
        this.status = status;
        this.project = project;
        this.id = id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TaskStatusEnum status) {
        this.status = status;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }
}
