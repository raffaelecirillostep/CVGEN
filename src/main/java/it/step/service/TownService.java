package it.step.service;

import it.step.model.Qualification;
import it.step.model.Town;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface TownService {
    Optional<Town> getTownByID(String id);
    List<Town> getAllTowns();
    Town saveTown(Town town);
    Town deleteTown(Town town);

    void insertCitiesFromJson(String jsonFilePath) throws IOException;

}
