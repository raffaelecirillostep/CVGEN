package it.step.mapper;

import it.step.dto.QualificationDTO;
import it.step.dto.TownDTO;
import it.step.model.Qualification;
import it.step.model.Town;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface TownMapper {

    Town townDtoToTown(TownDTO townDTO);
    TownDTO townToTownDto(Town town);
}

