package it.step.repository;

import it.step.model.Experience;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExperienceRepo extends MongoRepository<Experience, String> {
}
