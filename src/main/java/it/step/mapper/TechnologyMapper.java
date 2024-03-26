package it.step.mapper;

import it.step.dto.TechnologyDTO;
import it.step.model.Technology;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface TechnologyMapper {

    Technology technologyDtoToTechnology(TechnologyDTO technologyDTO);
    TechnologyDTO technologyToTechnologyDto(Technology technology);
}
