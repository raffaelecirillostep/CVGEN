package it.step.repository;

import it.step.model.Cv;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CvRepo extends MongoRepository<Cv, String> {
}
