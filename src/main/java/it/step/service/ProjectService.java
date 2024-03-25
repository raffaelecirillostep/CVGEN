package it.step.service;

import it.step.model.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    Optional<Project> getProjectByID(String id);
    List<Project> getAllProjects();
    Project saveProject(Project project);
    Project deleProject(Project project);
}
