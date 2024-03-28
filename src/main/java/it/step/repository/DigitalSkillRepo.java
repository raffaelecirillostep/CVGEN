package it.step.repository;

import it.step.model.DigitalSkill;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DigitalSkillRepo extends MongoRepository<DigitalSkill, String> {

    List<DigitalSkill> findAllByIsDeletedFalse();

}
