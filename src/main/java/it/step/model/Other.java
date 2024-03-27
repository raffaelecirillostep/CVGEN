package it.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Other {

    private LanguageSkill languageSkill;
    private List<DigitalSkill> digitalSkills;

}
