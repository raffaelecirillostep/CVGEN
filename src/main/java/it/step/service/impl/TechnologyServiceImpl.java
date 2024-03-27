package it.step.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.step.model.Technology;
import it.step.repository.TechnologyRepo;
import it.step.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.SourceLocator;
import java.io.IOException;
import java.util.Arrays;
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

    @Override
    public void insertTechnologiesFromJson(String jsonPath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        if(repo.count() == 0)
        {
            List<Technology> lst = Arrays.asList(mapper.readValue(new ClassPathResource(jsonPath).getInputStream(),Technology[].class));
            repo.saveAll(lst);
        }

    }
}
