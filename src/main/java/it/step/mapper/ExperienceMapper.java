package it.step.mapper;

import it.step.dto.ExperienceDTO;
import it.step.model.Experience;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {

    ExperienceDTO experienceToExperienceDTO(Experience experience);
    Experience experienceDTOToExperience(ExperienceDTO experienceDTO);
}
