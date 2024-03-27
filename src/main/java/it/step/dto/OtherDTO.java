package it.step.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherDTO {

    private LanguageSkillDTO languageSkill;
    private List<DigitalSkillDTO> digitalSkills;

}
