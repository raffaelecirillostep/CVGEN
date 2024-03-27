package it.step.service.impl;

import it.step.model.Technology;
import it.step.repository.TechnologyRepo;
import it.step.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TechnologyServiceImpl implements TechnologyService {

    private final TechnologyRepo repo;

    @Override
    public Optional<Technology> getTechnologyByID(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Technology> getAllTechnologies() {
        return repo.findAll();
    }

    @Override
    public Technology saveTechnology(Technology technology) {
        return repo.save(technology);
    }

    @Override
    public Technology deleteTechnology(Technology technology) {
        technology.setIsDeleted(!technology.getIsDeleted());
        if(technology.getIsDeleted()){
            technology.setDeletedAt(new Date());
        } else {
            technology.setDeletedAt(null);
        }
        repo.save(technology);
        return technology;
    }
}
