package it.step.mapper;

import it.step.dto.LanguageSkillDTO;
import it.step.dto.ProjectDTO;
import it.step.model.LanguageSkill;
import it.step.model.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface LanguageSkillMapper {
    LanguageSkill LanguageSkillDtoToLanguageSkill(LanguageSkillDTO languageSkillDTO);
    LanguageSkillDTO LanguageSkillToLanguageSkillDTO(LanguageSkill languageSkill);
}
