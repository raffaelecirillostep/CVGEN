package it.step.repository;

import it.step.model.Province;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProvinceRepo extends MongoRepository<Province, String> {
}
