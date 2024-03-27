package it.step.repository;

import it.step.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepo extends MongoRepository<Language, String> {
}
