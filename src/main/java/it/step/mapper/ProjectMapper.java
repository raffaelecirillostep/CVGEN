package it.step.mapper;

import it.step.dto.ProjectDTO;
import it.step.model.Project;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper {
    Project projectDtoToProject(ProjectDTO projectDTO);
    ProjectDTO projectToProjectDto(Project project);
}
