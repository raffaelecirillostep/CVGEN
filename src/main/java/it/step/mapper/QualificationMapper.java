package it.step.mapper;

import it.step.dto.QualificationDTO;
import it.step.model.Qualification;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface QualificationMapper {

    Qualification qualificationDtoToQualification(QualificationDTO qualificationDTO);
    QualificationDTO qualificationToQualificationDto(Qualification qualification);
}
