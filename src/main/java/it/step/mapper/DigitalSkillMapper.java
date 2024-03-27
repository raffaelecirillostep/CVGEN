package it.step.mapper;

import it.step.dto.DigitalSkillDTO;
import it.step.model.DigitalSkill;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface DigitalSkillMapper {
    DigitalSkill digitalSkillDtoToDigitalSkill(DigitalSkillDTO digitalSkillDTO);
    DigitalSkillDTO digitalSkillToDigitalSkillDto(DigitalSkill digitalSkill);
}
