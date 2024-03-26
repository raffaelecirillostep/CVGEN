package it.step.service;

import it.step.model.Experience;
import java.util.List;


public interface ExperienceService {
    
    Experience save(Experience experience);
    Experience getOneById (String id);
    List<Experience> getAll ();
    Experience update(Experience experience);
    Experience deleteById(String id);
}
