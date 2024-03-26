package it.step.mapper;


import it.step.dto.OtherinfoDTO;
import it.step.model.Otherinfo;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface OtherinfoMapper {

    OtherinfoDTO otherinfoToOtherinfoDto(Otherinfo otherinfo);
    Otherinfo otherinfoDtoToOtherinfo(OtherinfoDTO otherinfoDto);

}
