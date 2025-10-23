package com.marioProjects.marioPersonalProjects.projects;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @Column(name = "name", unique = true)
    private String projectName;
    private Long id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public Project() {}
    public Project(
            Long id,
            String name,
            LocalDate startDate,
            LocalDate endDate
    ) {
        this.id = id;
        this.projectName = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return projectName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public void setName(String name) { this.projectName = name; }
    public LocalDate getStartDate() { return startDate; }
    public void setStatrtDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
}
