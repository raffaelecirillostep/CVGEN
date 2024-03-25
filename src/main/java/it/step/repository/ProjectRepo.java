package it.step.repository;

import it.step.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepo extends MongoRepository<Project, String> {
}
