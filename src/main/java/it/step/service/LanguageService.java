package it.step.service;

import it.step.model.Language;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface LanguageService {

    public Language save(Language language);
    public Optional<Language> getOneById (String id);
    public List<Language> getAll ();
    public Language update(Language language);
    public Language deleteById(String id);
    void insertLanguageFromJson(String jsonPath) throws IOException;
}
