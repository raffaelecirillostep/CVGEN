package it.step.service.impl;

import it.step.model.Project;
import it.step.repository.ProjectRepo;
import it.step.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    
    private final ProjectRepo repo;
    
    @Override
    public Optional<Project> getProjectByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Project> getAllProjects() {
        return repo.findAll();
    }

    @Override
    public Project saveProject(Project project) {
        return repo.save(project);
    }

    @Override
    public Project deleProject(Project project) {
        project.setIsDeleted(!project.getIsDeleted());
        if(project.getIsDeleted()){
            project.setDeletedAt(new Date());
        } else {
            project.setDeletedAt(null);
        }
        repo.save(project);
        return project;
    }
}
