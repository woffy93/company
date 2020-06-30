package it.francesco.presentation.domain.dto;

public class PMDto extends Employee{
    private ProjectDto project;

    public PMDto(String cf, int ral, BadgeDto badge) {
        super(cf, ral, badge);
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }
}
