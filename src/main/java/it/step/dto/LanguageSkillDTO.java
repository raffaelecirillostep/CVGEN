package it.step.dto;

import it.step.model.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageSkillDTO {

    private Language nativeLanguage;
    private List<LanguageDTO> otherLanguage;



}
