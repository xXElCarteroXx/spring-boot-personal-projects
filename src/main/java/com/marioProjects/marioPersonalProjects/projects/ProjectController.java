package com.marioProjects.marioPersonalProjects.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/mprojects")
public class ProjectController {
    private ProjectService projectService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/details")
    public String getProjectDetails(@RequestParam(required = false) String projectName) {
        if (projectName != null) {
            Project projectToCheck = projectService.findProjectByName(projectName);
            if (projectToCheck != null) {
                return projectToCheck.getDescription();
            } return null;
        } else {
            String result = "";
            List<Project> projects = projectService.getAllProjects();
            for (Project project : projects) {
                result += project.getDescription() + "\n";
            }
            return result;
        }
    }

    @DeleteMapping("/{projectName}")
    public ResponseEntity<String> deleteProject(@PathVariable String projectName) {
        projectService.deleteProjectByName(projectName);
        return new ResponseEntity<>("Project deleted successfully", HttpStatus.OK);
    }
}
