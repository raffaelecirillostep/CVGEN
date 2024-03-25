package it.step.repository;

import it.step.model.Technology;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TechnologyRepo extends MongoRepository<Technology, String> {
}
