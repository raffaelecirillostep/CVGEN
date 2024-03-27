package it.step.mapper;

import it.step.dto.OtherDTO;
import it.step.model.Other;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface OtherMapper {

    Other otherDtoToOther(OtherDTO otherDTO);

    OtherDTO otherDtoToOther(Other other);

}
