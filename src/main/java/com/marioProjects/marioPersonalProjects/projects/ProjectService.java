package com.marioProjects.marioPersonalProjects.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project findProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public void deleteProjectById(Long projectId) {
        projectRepository.deleteById(projectId);
    }

    public void deleteProjectByName(String projectName) {
        Project project = projectRepository.findByProjectName(projectName).orElse(null);

        if(project != null) {
            projectRepository.delete(project);
        }
    }

    public String getProjectDescription(Project theProject) {
        Optional<Project> projectToCheck = projectRepository.findByProjectName(theProject.getName());

        if (projectToCheck.isPresent()) {
            Project proj = projectToCheck.get();
            return proj.getDescription();
        } return null;
    }

    public Project findProjectByName(String projectName) {
        return projectRepository.findByProjectName(projectName).orElse(null);
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public String save(Project project) {
        projectRepository.save(project);
        return "Project saved successfully";
    }
}