package it.step.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.step.model.Otherinfo;


import it.step.model.Town;
import it.step.repository.TownRepo;
import it.step.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TownServiceImpl implements TownService {

    @Autowired
    private TownRepo townRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Town> getAllTowns() {
        return townRepo.findAll();
    }

    @Override
    public Optional<Town> getTownByID(String id) {
        return townRepo.findById(id);
    }

    @Override
    public Town saveTown(Town town) {
        return townRepo.save(town);
    }

    @Override
    public Town deleteTown(Town town) {
        town.setIsDeleted(true);
        town.setDeletedAt(new Date());
        return town;
    }

    public void insertCitiesFromJson(String jsonFilePath) throws IOException {
        // Leggi il file JSON
        ObjectMapper objectMapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource(jsonFilePath);
        List<Town> towns = Arrays.asList(objectMapper.readValue(resource.getInputStream(), Town[].class));

        // Inserisci i dati su MongoDB
        mongoTemplate.insert(towns, Town.class);
    }
}
