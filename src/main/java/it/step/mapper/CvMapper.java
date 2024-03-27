package it.step.mapper;

import it.step.dto.CvDTO;
import it.step.model.Cv;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface CvMapper {

    Cv cvDtoToCv(CvDTO cvDTO);
    CvDTO cvToCvDTO(Cv cv);

}
