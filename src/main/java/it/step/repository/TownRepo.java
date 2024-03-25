package it.step.repository;

import it.step.model.Qualification;
import it.step.model.Town;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TownRepo extends MongoRepository<Town, String> {
}
