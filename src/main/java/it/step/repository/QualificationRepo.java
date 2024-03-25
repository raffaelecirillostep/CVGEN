package it.step.repository;

import it.step.model.Qualification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QualificationRepo extends MongoRepository<Qualification, String> {
}
