package it.step.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageSkill {

    private Language nativeLanguage;
    private List<Language> otherLanguage;

}