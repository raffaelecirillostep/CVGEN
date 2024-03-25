package it.step.repository;

import it.step.model.Otherinfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OtherinfoRepo extends MongoRepository<Otherinfo, String> {

}
