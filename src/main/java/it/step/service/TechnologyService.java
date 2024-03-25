package it.step.service;

import it.step.model.Technology;

import java.util.List;
import java.util.Optional;

public interface TechnologyService {

    Optional<Technology> getTechnologyByID(String id);
    List<Technology> getAllTechnologies();
    Technology saveTechnology(Technology technology);
    Technology deleteTechnology(Technology technology);
}
