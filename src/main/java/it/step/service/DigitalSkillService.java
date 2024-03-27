package it.step.service;

import it.step.model.DigitalSkill;

import java.util.List;
import java.util.Optional;

public interface DigitalSkillService {

    Optional<DigitalSkill> getDigitalSkillByID(String id);
    List<DigitalSkill> getAllDigitalSkills();
    DigitalSkill saveDigitalSkill(DigitalSkill digitalSkill);
    DigitalSkill deleteDigitalSkill(DigitalSkill digitalSkill);

}
