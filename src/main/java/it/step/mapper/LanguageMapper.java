package it.step.mapper;

import it.step.dto.LanguageDTO;
import it.step.model.Language;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LanguageMapper {

    LanguageDTO languageToLanguageDTO(Language language);
    Language languageDTOToLanguage(LanguageDTO languageDTO);
}
