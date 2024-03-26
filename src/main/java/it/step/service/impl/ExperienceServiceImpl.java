package it.step.service.impl;

import it.step.model.Experience;
import it.step.repository.ExperienceRepo;
import it.step.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepo repo;

    @Override
    public Experience save(Experience experience) {
        return repo.save(experience);
    }

    @Override
    public Experience getOneById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Experience> getAll() {
        return repo.findAll();
    }

    @Override
    public Experience update(Experience experience) {
        return repo.save(experience);
    }

    @Override
    public Experience deleteById(String id) {
        Experience ex = repo.findById(id).orElse(null);
        if(ex != null){
            ex.setDeleted(true);
            ex.setDeletedAt(new Date());
        }
        return ex != null ? repo.save(ex) : null;
    }
}

