package it.step.repository;

import it.step.model.DigitalSkill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DigitalSkillRepo extends MongoRepository<DigitalSkill, String> {
}
